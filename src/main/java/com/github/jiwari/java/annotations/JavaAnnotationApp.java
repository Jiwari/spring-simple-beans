package com.github.jiwari.java.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Coach coach = context.getBean("coach", Coach.class);
        System.out.println("coach.getTraining() = " + coach.getTraining());
        System.out.println("coach.yell() = " + coach.yell());
        System.out.println("coach.getEmailAddress() = " + coach.getEmailAddress());
        System.out.println("coach.getTeam() = " + coach.getTeam());
        YellService yellService = context.getBean("yellServiceImpl", YellService.class);

        context.close();
    }
}
