package com.kodilla.testing.forum.statistics;


public class StatisticsCalculate  {

    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        double quantityOfUser = statistics.usersNames().size();
        double quantityOfPost = statistics.postsCount();
        double quantityOfComment = statistics.commentsCount();

        if (quantityOfUser > 0){
            avgPostsPerUser = quantityOfPost / quantityOfUser;
            avgCommentsPerUser = quantityOfComment / quantityOfUser;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }
        if(quantityOfPost > 0) {
            avgCommentsPerPost = quantityOfComment / quantityOfPost;
        } else {
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


}
