package com.example.repository;

import com.example.model.Group;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class GroupRepository implements IGroupRepository{
    private static Map<Long, Group> groups;
    static{
        groups = new HashMap<>();
        groups.put(1L,new Group(1L,"Developer",null));
        groups.put(2L,new Group(2L,"Tester",null));
        groups.put(3L,new Group(3L,"Database",null));
        groups.put(4L,new Group(4L,"Admin",null));
    }
    @Override
    public List<Group> findAll() {
        return new ArrayList<>(groups.values());
    }

    @Override
    public Group findById(Long id) {
        Group group = groups.get(id);
        return group;
    }

    @Override
    public void save(Group group) {
        groups.put(group.getId(), group);
    }

    @Override
    public void delete(Long id) {
        groups.remove(id);
    }
}
