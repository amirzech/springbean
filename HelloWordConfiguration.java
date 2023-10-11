package com.in28mnutes.learn.spring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name, Integer age, Adress adress){};
record Adress(String firstline, String city){};
@Configuration
public class HelloWordConfiguration {
    @Bean
    public String name(){
        return "Amir";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    public Person person(){
        return new Person("David",20, new Adress("rue tirizi","wilaya debogirat"));
    }
    @Bean(name = "personne")
    public Person firstperson(){
        return new Person(name(), age(), adress());
    }

    @Bean(name = "ads")
    public Adress adress(){
        return new Adress("5 rue Jarry","Paris");
    }

}
