package com.example.repository;

import com.example.model.Group;
import com.example.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupRepository implements IGroupRepository{
    private static final Map<Long, Group> groups;
    static{
        groups = new HashMap<>();
        groups.put(1L,new Group(1L,"Developer",null));
        groups.put(2L,new Group(2L,"Tester",null));
        groups.put(3L,new Group(3L,"Database",null));
        groups.put(4L,new Group(4L,"Admin",null));
    }
    @Override
    public List<Group> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(Group group) {

    }

    @Override
    public void delete(Long id) {

    }
}
