package com.github.jiwari.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
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
