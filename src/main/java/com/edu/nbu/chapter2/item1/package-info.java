/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-19 15:51
 *  
 */
package com.edu.nbu.chapter2.item1;
//考虑用静态工厂方法代替构造器
//优点：1、方法有，明确的命名；2、不必每次调用时都要创建兑现；3、可以返回原返回类型的任何子类型的对象

//名词：服务提供者框架：service provider framework(SPF)
//SPF是这样一种系统：多个服务提供者实现一个服务，系统为服务提供者的客户端提供多个实现，并把他们从多个实现中解耦出来
//SPF包括三个主要组件：服务接口（service interface）——提供者实现的接口
//                   提供者注册API（Provider registration API）——系统用来 注册实现，供客户端访问
//                   服务访问API(Service Access API)—— 客户端用来获取服务实例
//第四个组件为可选组件：服务提供者接口
//以JDBC为例：
//        服务接口——Connection;
//        提供者注册API—— DriverManager.registerDriver;
//        服务访问API—— DriverManager.getConnection;
//        服务提供者接口 —— Driver

//缺点：1、如果工厂类不包含公有的或者protected 构造器，就不能被子类化
//     2、与一般静态方法没有区别
//常见静态工程方法命名：valueOf、newInstance、getInstance、of、newType、getType
