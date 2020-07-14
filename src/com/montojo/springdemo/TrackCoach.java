package com.montojo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTrackCoach")
@Scope("singleton")
public class TrackCoach implements Coach {


    FortuneService fortuneService;
    @Value("Pedrito")
    String name;
    @Value("${foo.email}")
    String email;

    private static int id;

    public TrackCoach() {
        id +=1;
        System.out.println("Track Coach instance: " + id);
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " , " + name + " email: " + email;
    }
}
