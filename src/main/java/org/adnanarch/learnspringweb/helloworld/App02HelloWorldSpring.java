package org.adnanarch.learnspringweb.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch Spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure things that we want Spring to manage
        //GameConfiguration - @Configuration
        //name - @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
//        System.out.println(context.getBean(Address.class));
    }
}
