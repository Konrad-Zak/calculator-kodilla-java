package com.kodilla.patterns.strategy.social.publisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        String socialMedium = "We use Facebook";
        System.out.println(socialMedium);
        return socialMedium;
    }
}
