package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.service.IvaService;
import it.objectmethod.supermarket.jpa.service.dto.IvaDTO;

@RestController
@RequestMapping("/api/iva")
public class IvaController {

	@Autowired
	IvaService ivaService;

	@GetMapping("/list")
	public List<IvaDTO> getIva() {

		return ivaService.findAll();
	}

}
