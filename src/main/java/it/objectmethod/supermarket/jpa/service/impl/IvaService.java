package it.objectmethod.supermarket.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.supermarket.jpa.dto.IvaDTO;
import it.objectmethod.supermarket.jpa.entity.Iva;
import it.objectmethod.supermarket.jpa.repository.IvaRepository;
import it.objectmethod.supermarket.jpa.service.mapper.IvaMapper;

@Service
public class IvaService {

	@Autowired
	IvaRepository ivaRepo;

	@Autowired
	IvaMapper ivaMapper;

	public List<IvaDTO> findAll() {
		List<Iva> ivaList = ivaRepo.findAll();
		List<IvaDTO> ivaListDto = new ArrayList<IvaDTO>();
		for (Iva e : ivaList) {
			IvaDTO ivaDto = ivaMapper.toDto(e);
			ivaListDto.add(ivaDto);
		}
		return ivaListDto;
	}

}
