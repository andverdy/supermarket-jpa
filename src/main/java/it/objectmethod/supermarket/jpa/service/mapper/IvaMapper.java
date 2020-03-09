package it.objectmethod.supermarket.jpa.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.entity.Iva;
import it.objectmethod.supermarket.jpa.service.dto.IvaDTO;

@Mapper(componentModel = "spring")
public interface IvaMapper extends EntityMapper<IvaDTO, Iva> {

	@Mapping(source = "idIva", target = "idIva")
	@Mapping(source = "descrizioine", target = "descrizioine")
	List<IvaDTO> toDto(List<Iva> ivaList);

	IvaDTO toDto(Iva iva);

	// List<D> toDto(E entity, D dto);
}
