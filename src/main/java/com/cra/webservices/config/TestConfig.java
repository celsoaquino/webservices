package com.cra.webservices.config;

import com.cra.webservices.entities.User;
import com.cra.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria brown", "maria@gmail.com","3535-5454","12345");
        User u2 = new User(null, "Alex green", "alex@gmail.com","5454-3535","54321");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
