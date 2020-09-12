package com.educandoweb.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	
     @GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l,"Maria","maria@gmail.com", "2222222","12234");
		return ResponseEntity.ok().body(u);
	}
	
}
