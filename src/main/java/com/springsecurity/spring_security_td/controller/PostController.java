package com.springsecurity.spring_security_td.controller;

import com.springsecurity.spring_security_td.model.Post;
import com.springsecurity.spring_security_td.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class PostController {
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPost(){ return  postService.getAll(); }

    @GetMapping("/posts/{postId}")
    public Post getPostById(@PathVariable Long postId){
        return postService.getById(postId);
    }

    @GetMapping("/posts/{userId}/posts")
    public List<Post> getUserPosts(@PathVariable Long userId){
        return postService.getPostByUserId(userId);
    }

    @PostMapping("/posts")
    public List<Post> savePost(@RequestBody List<Post> post){
        return postService.saveAll(post);}
}
