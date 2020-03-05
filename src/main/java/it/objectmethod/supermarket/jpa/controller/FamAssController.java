package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.entity.FamAss;
import it.objectmethod.supermarket.jpa.repository.FamAssRepository;

@RestController
@RequestMapping("/api/fam")
public class FamAssController {

	@Autowired
	FamAssRepository famRepo;

	@GetMapping("/list")
	public List<FamAss> getFam() {
		List<FamAss> famList = famRepo.findAll();

		return famList;
	}

}
