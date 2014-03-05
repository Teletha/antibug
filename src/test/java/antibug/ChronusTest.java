/*
 * Copyright (C) 2014 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package antibug;

import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import kiss.I;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

/**
 * @version 2014/03/05 9:21:24
 */
public class ChronusTest {

    @ClassRule
    public static final Chronus chronus = new Chronus(ChronusTest.class);

    /** The test result. */
    private static boolean done = false;

    @Before
    public void reset() {
        done = false;
    }

    @Test
    public void scheduledThreadPoolExecutorInt() throws Exception {
        execute(() -> {
            ScheduledExecutorService service = new ScheduledThreadPoolExecutor(2);
            service.schedule(createTask(), 10, MILLISECONDS);
        });
    }

    @Test
    public void newCachedThreadPool() throws Exception {
        execute(() -> {
            ExecutorService service = Executors.newCachedThreadPool();
            service.submit(createDelayedTask());
        });
    }

    @Test
    public void newCachedThreadPoolThreadFactory() throws Exception {
        execute(() -> {
            ExecutorService service = Executors.newCachedThreadPool(runnable -> {
                return new Thread(runnable);
            });
            service.submit(createDelayedTask());
        });
    }

    private static ExecutorService service = Executors.newCachedThreadPool();

    @Test
    public void staticField() throws Exception {
        execute(() -> {
            service.submit(createDelayedTask());
        });
    }

    @Test
    public void cancel() throws Exception {
        executeWithCancel(() -> {
            ExecutorService service = Executors.newCachedThreadPool(runnable -> {
                return new Thread(runnable);
            });
            return service.submit(createDelayedTask());
        });
    }

    /**
     * <p>
     * Create task.
     * </p>
     * 
     * @return
     */
    private static final Runnable createTask() {
        return () -> {
            done = true;
        };
    }

    /**
     * <p>
     * Create delayed task.
     * </p>
     * 
     * @return
     */
    private static final Runnable createDelayedTask() {
        return () -> {
            try {
                Thread.sleep(100);
                done = true;
            } catch (Exception e) {
                throw I.quiet(e);
            }
        };
    }

    /**
     * <p>
     * Helper method to test.
     * </p>
     * 
     * @param task
     */
    private final void execute(Runnable task) {
        task.run();
        assert done == false;
        chronus.await();
        assert done == true;
    }

    /**
     * <p>
     * Helper method to test.
     * </p>
     * 
     * @param task
     * @throws Exception
     */
    private final void executeWithCancel(Callable<Future> task) throws Exception {
        Future result = task.call();
        assert done == false;
        assert result.isCancelled() == false;

        result.cancel(true);
        chronus.await();

        assert done == false;
        assert result.isCancelled() == true;
    }
}