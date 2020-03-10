package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.service.dto.ArticleDTO;

@Mapper(componentModel = "spring", uses = { FamAssMapper.class, IvaMapper.class })
public interface ArticleMapper extends EntityMapper<ArticleDTO, Article> {

	@Mapping(source = "iva.idIva", target = "idIva")
	@Mapping(source = "famAss.id", target = "idFamAss")
	ArticleDTO toDto(Article article);

}