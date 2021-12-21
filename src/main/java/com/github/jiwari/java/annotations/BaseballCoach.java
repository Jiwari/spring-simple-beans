package com.github.jiwari.java.annotations;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BaseballCoach implements Coach {

    private YellService yellService;
    @Value("${coach.email}")
    private String emailAddress;
    @Value("${coach.team}")
    private String team;

    public BaseballCoach() {
    }

    public BaseballCoach(YellService yellService) {
        this.yellService = yellService;
    }

    public void setYellService(YellService yellService) {
        this.yellService = yellService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getTraining() {
        return "Hit the ball";
    }

    @Override
    public String yell() {
        return "My mom always said: " + yellService.yell();
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing BaseballCoach");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Closing BaseballCoach");
    }
}
