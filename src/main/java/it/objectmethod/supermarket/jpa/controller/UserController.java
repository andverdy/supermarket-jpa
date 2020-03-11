package it.objectmethod.supermarket.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.service.UserService;
import it.objectmethod.supermarket.jpa.service.dto.UserDTO;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@PutMapping("/save")
	public UserDTO userInsert(@RequestBody UserDTO userDto) {

		UserDTO userDTO = userService.save(userDto);

		return userDTO;
	}

	@PostMapping("/login")
	public Long userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

		return null;
	}

}
