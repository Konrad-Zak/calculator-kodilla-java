package com.kodilla.patterns.strategy.social.publisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        String socialMedium = "We use Twitter";
        System.out.println(socialMedium);
        return socialMedium;
    }
}
