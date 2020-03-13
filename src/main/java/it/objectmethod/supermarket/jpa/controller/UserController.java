package it.objectmethod.supermarket.jpa.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.controller.beans.LoggedUsers;
import it.objectmethod.supermarket.jpa.repository.UserRepository;
import it.objectmethod.supermarket.jpa.service.UserService;
import it.objectmethod.supermarket.jpa.service.dto.UserDTO;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepo;

	@Autowired
	LoggedUsers loggedUsers;

	@PutMapping("/save")
	public UserDTO userInsert(@RequestBody UserDTO userDto) {

		UserDTO userDTO = userService.save(userDto);

		return userDTO;
	}

	@PostMapping("/login")
	public ResponseEntity<Long> userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {

		ResponseEntity<Long> resp = null;
		UserDTO userDto = userService.findByUsernameAndPassword(username, password);
		Long token = null;
		if (userDto != null) {
			Random random = new Random();
			token = random.nextLong();
			if (token < 0) {
				token *= -1;
			}
			resp = new ResponseEntity<>(token, HttpStatus.OK);
		} else {

			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		loggedUsers.getMapLoggedUsers().put(token, userDto);

		return resp;

	}

	@GetMapping("/verify")
	public String verifyUserLogin() {

		return "Utente Loggato";
	}

}
