package com.github.jiwari.java.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:coach.properties")
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public YellServiceArrayImpl yellServiceArrayImpl() {
        return new YellServiceArrayImpl();
    }

    @Bean
    public YellServiceImpl yellServiceImpl() {
        return new YellServiceImpl();
    }

    @Bean
    public BaseballCoach coachArgs(
            @Qualifier("yellServiceArrayImpl") YellService yellService,
            @Value("${coach.email}") String email,
            @Value("${coach.team}") String team
    ) {
        BaseballCoach baseballCoach = new BaseballCoach(yellService);
        baseballCoach.setEmailAddress(email);
        baseballCoach.setTeam(team);
        return baseballCoach;
    }

    @Bean
    public BaseballCoach coach() {
        return new BaseballCoach(yellServiceArrayImpl());
    }

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new MyCustomBeanPostProcessor();
    }
}
