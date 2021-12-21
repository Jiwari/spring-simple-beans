package com.github.jiwari.java.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class YellServiceImpl implements YellService {

    @Override
    public String yell() {
        return "NEVER GIVE UP!";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct of YellServiceImpl");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy of YellServiceImpl");
    }
}
