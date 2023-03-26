package com.example.controller;

import com.example.model.User;
import com.example.service.GroupService;
import com.example.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GroupRestController {
    @Autowired
    GroupService groupService;
    @GetMapping("/users/list")
    public ResponseEntity<List<User>> listUsers() {
        List<User> users = groupService.getListUser();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
}
