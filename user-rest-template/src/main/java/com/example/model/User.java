package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Long id;
    private String name;
    private String yearBirth;
    private Long groupId;
    public User(){}

    public User(Long id, String name, String yearBirth, Long groupId) {
        this.id = id;
        this.name = name;
        this.yearBirth = yearBirth;
        this.groupId = groupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
