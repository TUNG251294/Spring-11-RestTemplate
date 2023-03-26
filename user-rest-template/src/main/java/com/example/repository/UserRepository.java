package com.example.repository;

import com.example.model.User;
import com.example.model.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class UserRepository implements IUserRepository{
    private static final Map<Long, User> users;
    static{
        users = new HashMap<>();
        users.put(1L,new User(1L,"Binh","1990",1L));
        users.put(2L,new User(2L,"Phuong","1991",1L));
        users.put(3L,new User(3L,"Tung","1992",2L));
        users.put(4L,new User(4L,"Linh","1993",2L));
        users.put(5L,new User(5L,"Minh","1994",3L));
        users.put(6L,new User(6L,"Anh","1995",3L));
        users.put(7L,new User(7L,"Hoang","1996",4L));
        users.put(8L,new User(8L,"Ha","1997",4L));
        users.put(9L,new User(9L,"Truc","1998",1L));
        users.put(10L,new User(10L,"Son","1999",2L));
    }
    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findById(Long id) {
        User user = users.get(id);
        return user;
    }

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(Long id) {
        users.remove(id);
    }

    public void findAllDto(){

    }
}
