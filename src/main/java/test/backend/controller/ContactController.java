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
import test.backend.model.Contact;
import test.backend.model.ContactRepository;

/**
 *
 * @author Matías
 */
@RestController
public class ContactController {
    
    @Autowired
    private ContactRepository contactRepository;
    
    @GetMapping("contact")
    public List<Contact> index() {
        return this.contactRepository.findAll();
    }
    
    @GetMapping("contact/user")
    public List<Contact> indexWithUser() {
        return this.contactRepository.findWithUser();
    }
    
    @GetMapping("contact/{id}")
    public Contact find(@PathVariable("id") long id) {
        return this.contactRepository.findById(id).get();
    }
    
    @PostMapping("contact")
    public Long store(@RequestBody Contact contact) {
        return this.contactRepository.save(contact).getId();
    }
    
}
