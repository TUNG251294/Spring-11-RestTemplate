package com.example.model;

import com.example.model.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Group {
    private Long id;
    private String name;
    private List<UserDto> userList;
    public Group(){}

    public Group(Long id, String name, List<UserDto> userList) {
        this.id = id;
        this.name = name;
        this.userList = userList;
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

    public List<UserDto> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDto> userList) {
        this.userList = userList;
    }
}
