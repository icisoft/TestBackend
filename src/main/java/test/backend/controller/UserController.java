/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.backend.model.User;
import test.backend.model.UserRepository;

/**
 *
 * @author Matías
 */
@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("user")
    public List<User> index() {
        return this.userRepository.findAll();
    }
    
    @GetMapping("user/contact")
    public List<User> indexWithContact() {
        return this.userRepository.getWithContacts();
    }
    
    @GetMapping("user/{id}")
    public User find(@PathVariable("id") long id) {
        return this.userRepository.findById(id).get();
    }
    
    @PostMapping("user")
    public Long store(@RequestBody User user) {
        return this.userRepository.save(user).getId();
    }
    
}
