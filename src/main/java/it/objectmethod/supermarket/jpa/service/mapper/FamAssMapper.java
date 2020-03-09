package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.supermarket.jpa.dto.FamAssDTO;
import it.objectmethod.supermarket.jpa.entity.FamAss;

@Mapper(componentModel = "spring")
public interface FamAssMapper extends EntityMapper<FamAssDTO, FamAss> {

	FamAssDTO toDto(FamAss famAss);

}
