package com.montojo.springdemo;

import org.springframework.stereotype.Component;

@Component
public interface Coach {

    public String getDailyWorkout();

    public String getDailyFortune();
}
