package com.example.users.model;

public class User {
    private int id;
    private String name;

    public User() {}
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}
