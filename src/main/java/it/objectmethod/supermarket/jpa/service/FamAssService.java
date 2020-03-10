package it.objectmethod.supermarket.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.supermarket.jpa.entity.FamAss;
import it.objectmethod.supermarket.jpa.repository.FamAssRepository;
import it.objectmethod.supermarket.jpa.service.dto.FamAssDTO;
import it.objectmethod.supermarket.jpa.service.mapper.FamAssMapper;

@Service
public class FamAssService {

	@Autowired
	FamAssRepository famRepo;

	@Autowired
	FamAssMapper famAssMapper;

	public List<FamAssDTO> findAll() {
		List<FamAss> famList = famRepo.findAll();
		List<FamAssDTO> famListDto = new ArrayList<FamAssDTO>();
		for (FamAss e : famList) {
			FamAssDTO famDto = famAssMapper.toDto(e);
			famListDto.add(famDto);
		}
		return famListDto;
	}
}
