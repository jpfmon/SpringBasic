package com.montojo.springdemo;

public class TrackCoach implements Coach {

    FortuneService fortuneService;
    String name;


    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " , " + name;
    }
}
