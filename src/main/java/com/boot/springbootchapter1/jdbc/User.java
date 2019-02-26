package com.boot.springbootchapter1.jdbc;

public class User {
    private Long id;
    private String usename;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[id:" + id + ",usename:" + usename + ",password:" + password + "]";
    }
}
