package com.montojo.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Hit the ball 10 times";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
