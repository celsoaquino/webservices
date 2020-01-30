package com.cra.webservices.resourses;

import com.cra.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> get(){
        User u = new User(1L, "maria", "maer@gamil.com", "54546-46546", "5415");
        return ResponseEntity.ok().body(u);
    }
}
