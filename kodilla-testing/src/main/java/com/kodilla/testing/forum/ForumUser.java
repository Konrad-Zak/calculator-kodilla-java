package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments =new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
    public void addPost(String author, String postBody){
        // do nothing
    }
    public void addComment(ForumPost thePost, String author, String comment){
        // do nothing
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
