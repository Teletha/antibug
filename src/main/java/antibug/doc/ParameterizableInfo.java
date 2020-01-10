/*
 * Copyright (C) 2019 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package antibug.doc;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Parameterizable;

import kiss.I;
import kiss.XML;
import kiss.Ⅱ;

public abstract class ParameterizableInfo extends MemberInfo {

    protected final List<Ⅱ<String, XML>> typeParameters = new ArrayList();

    /**
     * @param e
     */
    public ParameterizableInfo(Parameterizable e, TypeResolver resolver) {
        super(e, resolver);

        e.getTypeParameters().forEach(type -> {
            typeParameters.add(I.pair(type.getSimpleName().toString(), parseTypeAsXML(type.asType())));
        });
    }

    /**
     * Build paramter type element.
     * 
     * @return
     */
    public XML createPrameterType() {
        XML root = I.xml("i").addClass("parameter");
        for (Ⅱ<String, XML> type : typeParameters) {
            root.append(type.ⅱ.clone());
        }
        return root;
    }
}
