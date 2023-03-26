package com.example.service;

import com.example.model.Group;
import com.example.model.User;
import com.example.repository.IGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class GroupService implements IGroupService{
    @Autowired
    private IGroupRepository groupRepository;
    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findById(id);
    }

    @Override
    public void save(Group group) {
        groupRepository.save(group);
    }

    @Override
    public void delete(Long id) {
        groupRepository.delete(id);
    }

    public List<User> getListUser() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/api/users/list";
        //Su dung StringBuilder

        ResponseEntity<List<User>> response = restTemplate.exchange(    //response o day da duoc chuyen tu JSON ma hoa khi gui tu con service server(User) sang object
//        ResponseEntity<GetUserInfosModel> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,   //header,body...o day
                new ParameterizedTypeReference<List<User>>() {}
//                GetUserInfosModel.class thay thế dong trên
        );
//        if(response.getStatusCode().equals(HttpStatus.OK)){

            List<User> users = response.getBody();
//            List<User> users = response.getBody().getDatas();
        return users;

    }
}
