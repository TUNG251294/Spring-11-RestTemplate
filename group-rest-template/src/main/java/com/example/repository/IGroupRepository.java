package com.example.repository;

import com.example.model.Group;
import com.example.model.User;

import java.util.List;

public interface IGroupRepository {
    List<Group> findAll();
    User findById(Long id);
    void save(Group group);
    void delete(Long id);
}
