package com.backend2frontend;

import com.backend2frontend.model.User;
import com.backend2frontend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Backend2frontendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Backend2frontendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Linda", "Forlizzi", "linda@linda.com"));
		this.userRepository.save(new User("notLinda", "Forlizzi", "notLinda@linda.com"));
		this.userRepository.save(new User("Linda", "notForlizzi", "linda@notLinda.com"));
	}

//	check endpoint success: localhost:8080/api/users

}
