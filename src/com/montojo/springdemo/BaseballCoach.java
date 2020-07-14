package com.montojo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
@Scope("prototype")
public class BaseballCoach implements Coach {

    private static int id;
    private FortuneService fortuneService;

    @Autowired
    public BaseballCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        id +=1;
        System.out.println("Baseball Coach instance: " + id);
    }

    @Override
    public String getDailyWorkout() {

        return "Hit the ball 10 times";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " baseball coach said";
    }
}
