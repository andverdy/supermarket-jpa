package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.entity.Iva;
import it.objectmethod.supermarket.jpa.repository.IvaRepository;

@RestController
@RequestMapping("/api/iva")
public class IvaController {

	@Autowired
	IvaRepository ivaRepo;

	@GetMapping("/list")
	public List<Iva> getIva() {
		List<Iva> ivaList = ivaRepo.findAll();

		return ivaList;
	}

}
