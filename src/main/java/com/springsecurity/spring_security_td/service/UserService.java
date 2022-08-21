package com.springsecurity.spring_security_td.service;

import com.springsecurity.spring_security_td.model.User;
import com.springsecurity.spring_security_td.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User getById(Long id){ return repository.getReferenceById(id);}

    public List<User> getAll(){return  repository.findAll();}


    public List<User> saveAll(List<User> users){
        return repository.saveAll(users);
    }
}
