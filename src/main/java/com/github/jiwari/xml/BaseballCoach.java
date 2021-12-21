package com.github.jiwari.xml;

public class BaseballCoach implements Coach {

    private YellService yellService;
    private String emailAddress;
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

    public void init() {
        System.out.println("Initializing BaseballCoach");
    }

    public void destroy() {
        System.out.println("Closing BaseballCoach");
    }
}
