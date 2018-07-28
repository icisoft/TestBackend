/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.backend.model.Post;
import test.backend.model.PostRepository;

/**
 *
 * @author matia
 */
@RestController
public class PostController {
    
    @Autowired
    private PostRepository postRepository;
    
    @GetMapping("post")
    public List<Post> index() {
        return this.postRepository.findAll();
    }
    
    @GetMapping("post/user")
    public List<Post> indexWithUser() {
        return this.postRepository.findWithUser();
    }
    
}
