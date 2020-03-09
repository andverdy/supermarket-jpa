package it.objectmethod.supermarket.jpa.dto;

public class ArticleDTO {

	private String codArt;
	private String descrizione;
	private Integer pzCart;
	private Integer idFamAss;
	private Integer idIva;

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getPzCart() {
		return pzCart;
	}

	public void setPzCart(Integer pzCart) {
		this.pzCart = pzCart;
	}

	public Integer getIdFamAss() {
		return idFamAss;
	}

	public void setIdFamAss(Integer idFamAss) {
		this.idFamAss = idFamAss;
	}

	public Integer getIdIva() {
		return idIva;
	}

	public void setIdIva(Integer idIva) {
		this.idIva = idIva;
	}

}