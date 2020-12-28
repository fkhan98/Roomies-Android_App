package com.example.roomies.Matches;

public class MatchesObject {

    private String userId;
    private String name;
    private String profileImageUrl;
    private String userSex;

    public MatchesObject(String userId ,String name, String profileImageUrl,String userSex) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.userSex = userSex;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
