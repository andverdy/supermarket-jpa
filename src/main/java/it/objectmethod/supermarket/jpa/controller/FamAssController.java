package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.service.FamAssService;
import it.objectmethod.supermarket.jpa.service.dto.FamAssDTO;

@RestController
@CrossOrigin
@RequestMapping("/api/fam")
public class FamAssController {

	@Autowired
	FamAssService famAssService;

	@GetMapping("/list")
	public List<FamAssDTO> getFam() {

		return famAssService.findAll();
	}

}
