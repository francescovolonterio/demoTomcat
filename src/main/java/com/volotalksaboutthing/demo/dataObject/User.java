package com.volotalksaboutthings.myspringapp.dataObject;

public class User {
    
    private int userId;
    private String userName;
    private String userSurname;
    private int accessToken;

    public User() {};

    public User(int userId, String userName, String userSurname, int accessToken) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.accessToken = accessToken;
    }

    public int userId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public String getusernName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserSurname() {
        return userSurname;
    }

    public void setuserSurname(String usernSurname) {
        this.userSurname = usernSurname;
    }

    public int getaccessToken() {
        return accessToken;
    }

    public void setaccessToken(int accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "Users [userId=" + userId + ", username=" + userName + ", userSurname=" + userSurname
                + ", accessToken=" + accessToken + "]";
    }

    

}