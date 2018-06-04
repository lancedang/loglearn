###### 主题 
- 借此项目探究SLF4j及相关日志实现系统的使用及源码分析
- 写相关笔记

##### 项目说明
- IJ Maven web project

##### module 说明
- slf-first-demo
    1. log 入门开始教程，介绍 slf4j 及 各种日志实现框架的 pom 依赖
    2. 介绍 hello world slf4j 接口基本使用和不同日志级别、placeholder 的使用
    3. 以上都是未加 logback.xml 情况下进行的
    4. 验证了 pom 只需加入 bindings 则会传递依赖 slf4j-api 及 底层日志实现框架 jar 包的结论

- slf-logback-demo
    1. 介绍 slf4j + logback 的集成使用
    2. 同时加入 logback.xml 配置