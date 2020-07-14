package com.montojo.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Lucky day!";
    }
}
