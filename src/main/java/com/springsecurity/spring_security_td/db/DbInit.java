package com.springsecurity.spring_security_td.db;

import com.springsecurity.spring_security_td.model.User;
import com.springsecurity.spring_security_td.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        User loic = new User(6L,"Loic","Randria","loic@gmail.com","loic",passwordEncoder.encode("azerty"),"USER","");
        User admin = new User(7L,"admin","admin","admin@gmail.com","admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST");

        List<User> users = Arrays.asList(loic,admin);

        // Save to db
        this.userRepository.saveAll(users);
    }
}

