package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.supermarket.jpa.dto.IvaDTO;
import it.objectmethod.supermarket.jpa.entity.Iva;

@Mapper(componentModel = "spring")
public interface IvaMapper extends EntityMapper<IvaDTO, Iva> {

	IvaDTO toDto(Iva iva);

	// List<D> toDto(E entity, D dto);
}