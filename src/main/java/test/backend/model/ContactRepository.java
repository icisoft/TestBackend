/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Matías
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
    @Query("SELECT c FROM Contact c LEFT JOIN FETCH c.user u")
    public List<Contact> findWithUser();
    
}
