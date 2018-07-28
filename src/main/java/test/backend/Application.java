/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backend;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 *
 * @author Matías
 */
@SpringBootApplication
public class Application {
    
    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public Hibernate5Module getHibernateModuleBean() {
        Hibernate5Module module = new Hibernate5Module();
        return module;
    }
    
    @Autowired
    public void asd(MappingJackson2HttpMessageConverter m) {
        System.out.println(m);
    }
    
}
