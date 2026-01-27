package com.api.response;

import java.util.List;

public class LoginResponse {

    private String token;
    private String type;
    private int id;
    private String username;
    private String email;
    private List<String> roles;

    public LoginResponse(){

    }

    public LoginResponse(String email, int id, List<String> roles, String token, String type, String username) {
        this.email = email;
        this.id = id;
        this.roles = roles;
        this.token = token;
        this.type = type;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "email='" + email + '\'' +
                ", token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", roles=" + roles +
                '}';
    }
}
