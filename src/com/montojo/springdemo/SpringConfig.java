package com.montojo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.montojo.springdemo")
@PropertySource("classpath:sport.properties")
public class SpringConfig {

//    All this below would be needed for configuration if not @ComponentScan is used.
//    @Bean
//    public FortuneService happyFortuneService(){
//        return new HappyFortuneService();
//    }
//
//    @Bean
//    public Coach baseballCoach(){
//        BaseballCoach baseballCoach = new BaseballCoach(happyFortuneService());
//        return baseballCoach;
//    }


}
