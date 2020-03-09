package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.entity.FamAss;
import it.objectmethod.supermarket.jpa.service.dto.FamAssDTO;

@Mapper(componentModel = "spring")
public interface FamAssMapper extends EntityMapper<FamAssDTO, FamAss> {

	@Mapping(source = "id", target = "id")
	@Mapping(source = "descrizioine", target = "descrizioine")
	FamAssDTO toDto(FamAss famAss);

}
