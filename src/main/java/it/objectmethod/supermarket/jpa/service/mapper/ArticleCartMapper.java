package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.service.dto.ArticleCartDTO;

@Mapper(componentModel = "spring", uses = { FamAssMapper.class, IvaMapper.class })
public interface ArticleCartMapper extends EntityMapper<ArticleCartDTO, Article> {

	@Mapping(source = "famAss.descrizione", target = "famAssDesc")
	@Mapping(source = "iva.descrizione", target = "ivaDesc")
	@Mapping(source = "iva.idIva", target = "idIva")
	@Mapping(source = "famAss.id", target = "idFamAss")
	ArticleCartDTO toDto(Article article);

}
