//package xyz.kenor.restservice;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
///**
// * @author ：kenor
// * @date ：Created in 2020/8/16 9:02
// * @description：
// * @version: 1.0
// */
///*
//① Configuration: Tags the class as a source of bean definitions for the application context.
//
//② @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
//other beans, and various property settings. For example, if spring-webmvc is on the classpath,
// this annotation flags the application as a web application and activates key behaviors,
//  such as setting up a DispatcherServlet.
//
//③ @ComponentScan: Tells Spring to look for other components, configurations,
//and services in the xyz/kenor package, letting it find the controllers.
// */
//@SpringBootApplication
//public class ApplicationStart {
//    /*
//    The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.
//     Did you notice that there was not a single line of XML? There is no web.xml file, either.
//     This web application is 100% pure Java and you did not have to deal with configuring any
//     plumbing or infrastructure.
//     */
//    public static void main(String[] args) {
//        SpringApplication.run(ApplicationStart.class, args);
//    }
//}
