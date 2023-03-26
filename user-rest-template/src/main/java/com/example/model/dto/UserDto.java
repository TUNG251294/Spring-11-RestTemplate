package com.example.model.dto;

public class UserDto {
    private Long id;
    private String name;
    private String yearBirth;
    public UserDto(){}

    public UserDto(Long id, String name, String yearBirth) {
        this.id = id;
        this.name = name;
        this.yearBirth = yearBirth;
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
}
