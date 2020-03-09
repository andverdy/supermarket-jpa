package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.supermarket.jpa.entity.FamAss;
import it.objectmethod.supermarket.jpa.service.dto.FamAssDTO;

@Mapper(componentModel = "spring")
public interface FamAssMapper extends EntityMapper<FamAssDTO, FamAss> {

}