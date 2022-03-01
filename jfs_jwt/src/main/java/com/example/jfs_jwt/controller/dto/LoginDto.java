package com.example.jfs_jwt.controller.dto;

public class LoginDto {

    private final String username;
    private final String password;

    public LoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*getters*/
    public String getUsername() {
        return this.username;

    }

    public String getPassword() {
        return this.password;
    }
}
