package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int quantityOfPost;

    public ForumUser(final int userId, final String userName, final char userSex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int quantityOfPost) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.quantityOfPost = quantityOfPost;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPost() {
        return quantityOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", quantityOfPost=" + quantityOfPost +
                '}';
    }
}

