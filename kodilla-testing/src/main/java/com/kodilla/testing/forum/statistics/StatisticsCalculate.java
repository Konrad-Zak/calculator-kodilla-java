package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculate  {

    private Integer quantityOfUser;
    private Integer quantityOfPost;
    private Integer quantityOfComment;
    private Double avgPostsPerUser;
    private Double avgCommentsPerUser;
    private Double avgCommentsPerPost;

    Statistics statistics;


    public void calculateAdvStatistics(Statistics statistics){
        //List<String> forumUsers = statistics.usersNames();
        quantityOfUser = statistics.usersNames().size();
        quantityOfPost = statistics.postsCount();
        quantityOfComment = statistics.commentsCount();

        if (quantityOfUser > 0){
            avgPostsPerUser = Double.valueOf(quantityOfPost / quantityOfUser);
            avgCommentsPerUser = Double.valueOf(quantityOfComment/quantityOfUser);
        } else {
            avgPostsPerUser = Double.valueOf(0);
            avgCommentsPerUser = Double.valueOf(0);
        }
        if(quantityOfPost > 0) {
            avgCommentsPerPost = Double.valueOf(quantityOfComment / quantityOfPost);
        } else {
            avgCommentsPerPost = Double.valueOf(0);
        }
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
