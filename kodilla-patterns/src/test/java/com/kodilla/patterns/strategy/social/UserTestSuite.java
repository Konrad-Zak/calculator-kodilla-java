package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mark = new Millenials("Mark Non");
        User adam = new YGeneration("Adam Moor");
        User john = new ZGeneration("John Rambo");
        //When
        String markPublisher = mark.sharePost();
        String adamPublisher = adam.sharePost();
        String johnPublisher = john.sharePost();
        //Then
        Assert.assertEquals("We use Facebook",markPublisher);
        Assert.assertEquals("We use Snapchat",adamPublisher);
        Assert.assertEquals("We use Twitter",johnPublisher);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User adam = new YGeneration("Adam Moor");
        adam.setSocialPublisher(new FacebookPublisher());
        //When
        String adamPublisher = adam.sharePost();
        //Then
        Assert.assertEquals("We use Facebook",adamPublisher);
    }

}
