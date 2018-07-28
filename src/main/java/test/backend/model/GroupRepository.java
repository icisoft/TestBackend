/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author matia
 */
public interface GroupRepository extends JpaRepository<Group, Long> {
    
}
