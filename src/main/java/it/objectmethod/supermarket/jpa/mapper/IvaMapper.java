package it.objectmethod.supermarket.jpa.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.supermarket.jpa.entity.Iva;
import it.objectmethod.supermarket.jpa.service.dto.IvaDTO;

@Mapper(componentModel = "spring")
public interface IvaMapper extends EntityMapper<IvaDTO, Iva> {

	IvaDTO toDto(Iva iva);

	// List<D> toDto(E entity, D dto);
}