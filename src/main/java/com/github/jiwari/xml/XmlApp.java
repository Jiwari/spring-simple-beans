package com.github.jiwari.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("coach", Coach.class);
        System.out.println("coach.getTraining() = " + coach.getTraining());
        System.out.println("coach.yell() = " + coach.yell());
        System.out.println("coach.getEmailAddress() = " + coach.getEmailAddress());
        System.out.println("coach.getTeam() = " + coach.getTeam());

        context.close();
    }
}
