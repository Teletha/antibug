# Changelog

## [1.12.3](https://github.com/teletha/antibug/compare/v1.12.2...v1.12.3) (2024-12-04)


### Bug Fixes

* SVG re-sorts by the visualization item ([eadbef3](https://github.com/teletha/antibug/commit/eadbef35f58ef33f81debac26cf72c3b5f936e20))
* throughput value overflows during SVG output of benchmark ([a6c25c0](https://github.com/teletha/antibug/commit/a6c25c050aa75c01ef483e3c4c03636667fb0786))

## [1.12.2](https://github.com/teletha/antibug/compare/v1.12.1...v1.12.2) (2024-11-12)


### Bug Fixes

* Premain Agent is broken ([aa72e15](https://github.com/teletha/antibug/commit/aa72e15b1681b888e84da275b4c8ed864616006b))

## [1.12.1](https://github.com/teletha/antibug/compare/v1.12.0...v1.12.1) (2024-11-11)


### Bug Fixes

* require Java 21 ([059e39d](https://github.com/teletha/antibug/commit/059e39d220c88aced799b8f94590cc25ab5d0d75))

## [1.12.0](https://github.com/teletha/antibug/compare/v1.11.0...v1.12.0) (2024-10-20)


### Features

* make visualization items configurable ([6e4ff4c](https://github.com/teletha/antibug/commit/6e4ff4c2372c65b67c2f06c4804e26db1d899bee))

## [1.11.0](https://github.com/teletha/antibug/compare/v1.10.0...v1.11.0) (2024-10-18)


### Features

* provide BenchmarkEnvironment ([c393344](https://github.com/teletha/antibug/commit/c393344ec528ff3893a30d9f615cf4669c9a3b81))

## [1.10.0](https://github.com/teletha/antibug/compare/v1.9.1...v1.10.0) (2024-10-13)


### Features

* CommandLineUser exposes all user interfaces ([88ae0a7](https://github.com/teletha/antibug/commit/88ae0a72283b9d14200a7c3a54d1531bd451ec75))

## [1.9.1](https://github.com/teletha/antibug/compare/v1.9.0...v1.9.1) (2024-10-11)


### Bug Fixes

* ignore not-existence file ([01bb09d](https://github.com/teletha/antibug/commit/01bb09d4d060d5e1ff2f2890a5164fa6d4e3fb10))
* virtual room don't need to sweep temporal files ([b02666d](https://github.com/teletha/antibug/commit/b02666dfb9f878d3bf9b40c713ee66bb5a2a8294))

## [1.9.0](https://github.com/teletha/antibug/compare/v1.8.0...v1.9.0) (2024-08-23)


### Features

* add assertion utility ([d5129a2](https://github.com/teletha/antibug/commit/d5129a29110c11d59625ca9fa600b03e5d378297))

## [1.8.0](https://github.com/teletha/antibug/compare/v1.7.1...v1.8.0) (2024-08-22)


### Features

* add virtual clean room ([90e3162](https://github.com/teletha/antibug/commit/90e3162b52cdd2404833af4a6f1159118b5723e3))


### Bug Fixes

* update junit ([54111c6](https://github.com/teletha/antibug/commit/54111c6d7abae9705e4a9608ddda724a27f35500))

## [1.7.1](https://github.com/teletha/antibug/compare/v1.7.0...v1.7.1) (2024-03-01)


### Bug Fixes

* update byte-buddy ([30c626d](https://github.com/teletha/antibug/commit/30c626de91d2950224684838cb31d80a414484ad))

## [1.7.0](https://github.com/teletha/antibug/compare/v1.6.0...v1.7.0) (2024-01-29)


### Features

* MANIFEST.MF for javaagent ([09f3bab](https://github.com/teletha/antibug/commit/09f3bab5b9d5717ce62cc665a3163153d60f237c))


### Bug Fixes

* update ci process ([b6c8409](https://github.com/teletha/antibug/commit/b6c8409e85050f3e133d5b5caccad8155d460c68))

## [1.6.0](https://github.com/teletha/antibug/compare/v1.5.1...v1.6.0) (2024-01-01)


### Features

* Put power asserted method info in extension context. ([034c490](https://github.com/teletha/antibug/commit/034c4900f661b4702148317d56bff468129b8394))
* update junit ([983e080](https://github.com/teletha/antibug/commit/983e0806c651f7496ab35b06c3d84ffbae3eeb44))


### Bug Fixes

* update license ([9bf1dfd](https://github.com/teletha/antibug/commit/9bf1dfd04d59091f02439233b1b1664f2463546e))

## [1.5.1](https://github.com/teletha/antibug/compare/v1.5.0...v1.5.1) (2023-01-06)


### Bug Fixes

* show the mean of throughput on CUI ([3d19171](https://github.com/teletha/antibug/commit/3d191714c6e187885d116b53b56c00061dd34104))
* update junit ([c12b473](https://github.com/teletha/antibug/commit/c12b4735ddae438c0cde41a6153dc5d87927eeaf))

## [1.5.0](https://github.com/teletha/antibug/compare/v1.4.1...v1.5.0) (2022-10-20)


### Features

* Benchmark shows the runtime info. ([cef39a7](https://github.com/teletha/antibug/commit/cef39a70dbab5772f65155066df084149317cd2b))
* Benchmark shows the version of libraries. ([4bdff9c](https://github.com/teletha/antibug/commit/4bdff9c141e72392323183c6a28908b7cc559c3c))


### Bug Fixes

* change svg style ([7099fa3](https://github.com/teletha/antibug/commit/7099fa3397af46887c2de6301fe9f7ae799cfc5d))
* change the way of version detection ([60a63e5](https://github.com/teletha/antibug/commit/60a63e58c884682af774c40442cbd072e9c6ae0e))
* show benchmark name on CUI runner ([f428d95](https://github.com/teletha/antibug/commit/f428d95161e46be1b23418abe20ff912e3b25473))
* svg style ([959b088](https://github.com/teletha/antibug/commit/959b088f8a009c22429d5421030152a50c69d100))

## [1.4.1](https://github.com/teletha/antibug/compare/v1.4.0...v1.4.1) (2022-10-01)


### Bug Fixes

* change method for visual report. ([15551b6](https://github.com/teletha/antibug/commit/15551b64af39a9765cb9fd3bef4bfef825aae488))

## [1.4.0](https://www.github.com/teletha/antibug/compare/v1.3.0...v1.4.0) (2022-08-24)


### Features

* Benchmark can output SVG report. ([02eefa4](https://www.github.com/teletha/antibug/commit/02eefa4ede4b178621061ff41302cd8a32464461))
* Drop MeasurableCode#getMedian. ([e7ca18f](https://www.github.com/teletha/antibug/commit/e7ca18ff4f62d12d6e2cc0ba41847d0b71eefbac))


### Bug Fixes

* Update junit. ([dd299b9](https://www.github.com/teletha/antibug/commit/dd299b951796013493a01c01f0c1b3809b18d220))

## [1.3.0](https://www.github.com/teletha/antibug/compare/v1.2.7...v1.3.0) (2022-02-06)


### Features

* Benchmark can config the duration of trial. ([fbb0333](https://www.github.com/teletha/antibug/commit/fbb0333335a0d6c2f82a3aecf8980a9d333c8f24))
* Benchmark records the peak meory usage. ([11919a1](https://www.github.com/teletha/antibug/commit/11919a1b90f5e91d46eaf86d3ac49322a50da019))
* Enhance benchmark. ([ed4e7bd](https://www.github.com/teletha/antibug/commit/ed4e7bde19fe893f6ddff32c86042e991f35d60c))
* Run benchmark code on the forked JVM. ([7f2fcec](https://www.github.com/teletha/antibug/commit/7f2fcec4356152f6c5824faa9a499d7e3eb02472))


### Bug Fixes

* Enhance benchmark. ([c0fb8f0](https://www.github.com/teletha/antibug/commit/c0fb8f009c9a1511e7cb07a28abefd47a29cf40c))
* Format benchmark result. ([4548fd7](https://www.github.com/teletha/antibug/commit/4548fd7c3f841fb09e3d20cf71a9e6b1f3a7b887))
* Handle fatal error in the forked JVM. ([af86e8c](https://www.github.com/teletha/antibug/commit/af86e8c514609e9fc8c13fcb523fd3aac303631e))

### [1.2.7](https://www.github.com/teletha/antibug/compare/v1.2.6...v1.2.7) (2021-12-31)


### Bug Fixes

* Emulate callback executions when power-assert retry. ([17cc2a7](https://www.github.com/teletha/antibug/commit/17cc2a7a790abc8d3f143f49bafaacf2c0aee992))
* Some async test error. ([d5a6aa1](https://www.github.com/teletha/antibug/commit/d5a6aa1949ab186404971deaa60edf6589b99bc6))

### [1.2.6](https://www.github.com/teletha/antibug/compare/v1.2.5...v1.2.6) (2021-12-17)


### Bug Fixes

* update build process ([dbd3a49](https://www.github.com/teletha/antibug/commit/dbd3a495c4d08d2bc61ec3734b05a12a99760f6c))

### [1.2.5](https://www.github.com/teletha/antibug/compare/v1.2.4...v1.2.5) (2021-11-18)


### Miscellaneous Chores

* build process ([959c335](https://www.github.com/teletha/antibug/commit/959c335d4ae50298aea257a37bdd5b372d7757e3))

### [1.2.4](https://www.github.com/teletha/antibug/compare/v1.2.3...v1.2.4) (2021-11-18)


### Miscellaneous Chores

* Update build process. ([07edef4](https://www.github.com/teletha/antibug/commit/07edef41ab8564703f33805cf944c7e69ae4292b))

### [1.2.3](https://www.github.com/teletha/antibug/compare/v1.2.2...v1.2.3) (2021-11-18)


### Miscellaneous Chores

* Update build process. ([9e9e0d7](https://www.github.com/teletha/antibug/commit/9e9e0d726d8d2c36c92920fa85b4811e735b271d))

### [1.2.2](https://www.github.com/teletha/antibug/compare/v1.2.1...v1.2.2) (2021-11-15)


### Miscellaneous Chores

* Update build process. ([2e9b284](https://www.github.com/teletha/antibug/commit/2e9b28441008734df2cd211d63ecf59a98f4c153))

### [1.2.1](https://www.github.com/teletha/antibug/compare/v1.2.0...v1.2.1) (2021-11-15)


### Bug Fixes

* Agent related methods must be public in Java 17. ([c6de59e](https://www.github.com/teletha/antibug/commit/c6de59ef9179ae30045896d1a16179336b6cbe20))
* Ignore error while deleting temporary files. ([dd5a0cf](https://www.github.com/teletha/antibug/commit/dd5a0cff202d129716fed6cbf5070ecdfb7f85ad))

## [1.2.0](https://www.github.com/Teletha/antibug/compare/v1.1.0...v1.2.0) (2021-09-25)


### Features

* Add Benchmark#discardSystemOutput. ([a0c03a2](https://www.github.com/Teletha/antibug/commit/a0c03a25ede8853e6e41dcd76c4d8d13e71bb908))
* Benchmark#measure accepts setup code. ([e8998c2](https://www.github.com/Teletha/antibug/commit/e8998c2925169e4a1c0c85f99025640065a1e999))


### Bug Fixes

* Activate GC on the begining of benchmark test. ([d1f6f2e](https://www.github.com/Teletha/antibug/commit/d1f6f2ee410900bad21fd562c955e766fa592d3a))

## [1.1.0](https://www.github.com/Teletha/antibug/compare/v1.0.3...v1.1.0) (2021-09-13)


### Features

* Update junit. ([3d999f8](https://www.github.com/Teletha/antibug/commit/3d999f8074cbffb5b66124c195e8af572baa0b72))

### [1.0.3](https://www.github.com/Teletha/antibug/compare/v1.0.2...v1.0.3) (2021-03-25)


### Bug Fixes

* Make code compilable by javac. ([04a0401](https://www.github.com/Teletha/antibug/commit/04a04013fcf0d75aaa6079e5c8a23fdf77cb1dae))
* PowerAssert fails on lambda method compiled by javac. ([e4423fd](https://www.github.com/Teletha/antibug/commit/e4423fd43dce4b6003884951ca45c84cfe4b44f3))

### [1.0.2](https://www.github.com/Teletha/Antibug/compare/1.0.1...v1.0.2) (2021-03-21)


### Bug Fixes

* Invalid version. ([bf9e9cd](https://www.github.com/Teletha/Antibug/commit/bf9e9cdfef29ff0a6e89f12080a8386bf81cc98d))
