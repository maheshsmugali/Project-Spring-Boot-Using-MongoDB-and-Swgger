package com.pws.mongodbjoblisting.controller;


import com.pws.mongodbjoblisting.model.Post;
import com.pws.mongodbjoblisting.repo.PostRepository;
import com.pws.mongodbjoblisting.repo.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return  repo.save(post);
    }

}
