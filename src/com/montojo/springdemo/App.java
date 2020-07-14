package com.montojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myBaseballCoach",Coach.class);

        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        Coach trackCoach = context.getBean("myTrackCoach",TrackCoach.class);
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        context.close();

    }
}
