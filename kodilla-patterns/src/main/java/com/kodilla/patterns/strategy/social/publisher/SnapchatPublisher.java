package com.kodilla.patterns.strategy.social.publisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        String socialMedium = "We use Snapchat";
        System.out.println(socialMedium);
        return socialMedium;
    }
}
