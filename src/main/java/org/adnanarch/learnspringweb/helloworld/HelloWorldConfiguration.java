package org.adnanarch.learnspringweb.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate Verbosity in creating Java Beans
// public accessor methods, constructor, equals, hashCode and toString are automatically created.
// Released in JDK 16.
record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Adnan";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Ali", 25, new Address("Green Town", "Sahiwal"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    @Primary
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean (name = "address2")
    @Primary
    public Address address(){
        return new Address("Kachery Road", "Pakpattan");
    }

    @Bean (name = "address3")
    @Qualifier("address3Qualifier")
    public Address address3(){
        return new Address("Pine Vally", "Pakpattan");
    }
}
