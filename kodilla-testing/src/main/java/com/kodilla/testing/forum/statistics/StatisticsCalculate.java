package com.kodilla.testing.forum.statistics;


public class StatisticsCalculate  {
    private int quantityOfUser;
    private int quantityOfPost;
    private int quantityOfComment;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        quantityOfUser = statistics.usersNames().size();
        quantityOfPost = statistics.postsCount();
        quantityOfComment = statistics.commentsCount();

        if (quantityOfUser > 0 && quantityOfPost > 0 && quantityOfComment > 0){
            avgPostsPerUser = (double) quantityOfPost / (double) quantityOfUser;
            avgCommentsPerUser = (double) quantityOfComment / (double)quantityOfUser;
            avgCommentsPerPost = (double) quantityOfComment / (double) quantityOfPost;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
            avgCommentsPerPost = 0;
        }
    }

    @Override
    public String toString() {
        return "\n Average number of posts per user: " + avgPostsPerUser +
                "\n Average number of comments per user: " + avgCommentsPerUser +
                "\n Average number of comments per post: " + avgCommentsPerPost;
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

    public double getQuantityOfUser() {
        return quantityOfUser;
    }

    public double getQuantityOfPost() {
        return quantityOfPost;
    }

    public double getQuantityOfComment() {
        return quantityOfComment;
    }
}
