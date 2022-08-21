package com.springsecurity.spring_security_td.service;

import com.springsecurity.spring_security_td.model.Post;
import com.springsecurity.spring_security_td.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;

    public  List<Post> getAll(){ return repository.findAll();}

    public Post getById(Long postId){return repository.getReferenceById(postId);}


    public List<Post> saveAll(List<Post> post){return repository.saveAll(post);}

    public List<Post> getPostByUserId(Long id){ return repository.findByUserId(id);}
}
