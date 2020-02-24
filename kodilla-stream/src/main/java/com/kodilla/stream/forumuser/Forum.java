package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Adam",'M',
                1992,10,23,2));
        userList.add(new ForumUser(2,"maxia",'F',
                1952,11,11,3));
        userList.add(new ForumUser(3,"xiaomi",'M',
                1945,12,14,1));
        userList.add(new ForumUser(4,"xenia",'F',
                2001,5,13,0));
        userList.add(new ForumUser(5,"Robert",'M',
                2010,2,21,60));
        userList.add(new ForumUser(6,"Adam",'M',
                2000,2,24,1));
        userList.add(new ForumUser(7,"anna",'F',
                1997,7,11,1));
        userList.add(new ForumUser(8,"Darek",'M',
                1991,1,16,0));
        userList.add(new ForumUser(9,"Kinga",'F',
                1999,10,30,5));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
