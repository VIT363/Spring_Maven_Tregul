package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        //Dog yourDog = context.getBean("myPet", Dog.class);
        myDog.say();
       // yourDog.say();
        context.close();
    }
}
