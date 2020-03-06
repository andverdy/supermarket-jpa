package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.entity.ArticleDTO;


@Mapper(componentModel = "spring")
public interface ArticleMapper extends EntityMapper<ArticleDTO, Article> {
	
	@Mapping(source = "iva.getIdIva()", target = "idIva")
	@Mapping(source = "famAss.getId()", target = "idFamAss")
	ArticleDTO toDto(Article article);
	
}
