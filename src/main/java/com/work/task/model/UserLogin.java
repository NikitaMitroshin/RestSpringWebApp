package com.work.task.model;

public class UserLogin {
    private Integer id;
    private String firstName;
    private String lastName;
    private String status;
    private String email;
    private String username;
    private String password;
    private String error_user;

    public UserLogin(Integer id, String firstName, String lastName, String status, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public UserLogin(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public UserLogin(String error_user) {
        this.error_user = error_user;
    }

    public UserLogin() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getError_user() {
        return error_user;
    }

    public void setError_user(String error_user) {
        this.error_user = error_user;
    }

    @Override
    public String toString() {
        return String.format(
                "User [id=%s, username=%s, password=%s, first_name=%s, last_name=%s, status=%s, email=%s]", id,
                username, password, firstName, lastName, status, email);
    }
}
