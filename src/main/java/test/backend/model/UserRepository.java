/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend.model;

import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Matías
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.contacts c LEFT JOIN FETCH u.group LEFT JOIN FETCH u.posts p")
    @EntityGraph(value = "User.posts", type = EntityGraph.EntityGraphType.LOAD)
    public List<User> findWithContacts();

}
