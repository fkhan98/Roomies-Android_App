package com.example.roomies.Cards;

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    private String batch;
    private String department;
    public cards(String userId , String name, String profileImageUrl,String batch,String department) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.batch = batch;
        this.department = department;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatch() {
        return batch;
    }
    public String getDepartment() {
        return department;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }


}
