package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        LocalDate nowDate;
        nowDate = LocalDate.now();
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser ->forumUser.getBirthDate().isBefore(nowDate.minusYears(20).plusDays(1)) )
                .filter(forumUser -> forumUser.getQuantityOfPost()>0)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
