package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEsc = new ForumUser("Ivone Esc");
        ForumUser jessicNon = new ForumUser("Jessic Non");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEsc);
        javaHelpForum.registerObserver(jessicNon);
        javaToolsForum.registerObserver(jessicNon);
        //When
        javaHelpForum.addPost("post 1");
        javaHelpForum.addPost("post 2");
        javaToolsForum.addPost("post 1");
        javaHelpForum.addPost("post 3");
        javaToolsForum.addPost("post 2");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEsc.getUpdateCount());
        assertEquals(5,jessicNon.getUpdateCount());
    }
}
