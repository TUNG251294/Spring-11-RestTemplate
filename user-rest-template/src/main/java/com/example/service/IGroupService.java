package com.example.service;

import com.example.model.Group;
import com.example.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface IGroupService extends IGeneralService<Group> {

}
