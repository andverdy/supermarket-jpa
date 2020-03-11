package it.objectmethod.supermarket.jpa.service.dto;

public class ArticleDTO {

	private String codArt;
	private String descrizione;
	private Integer pzCart;
	private String ivaDesc;
	private String famAssDesc;
	private Integer idIva;
	private Integer idFamAss;
	
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
	public String getIvaDesc() {
		return ivaDesc;
	}
	public void setIvaDesc(String ivaDesc) {
		this.ivaDesc = ivaDesc;
	}
	public String getFamAssDesc() {
		return famAssDesc;
	}
	public void setFamAssDesc(String famAssDesc) {
		this.famAssDesc = famAssDesc;
	}
	public Integer getIdIva() {
		return idIva;
	}
	public void setIdIva(Integer idIva) {
		this.idIva = idIva;
	}
	public Integer getIdFamAss() {
		return idFamAss;
	}
	public void setIdFamAss(Integer idFamAss) {
		this.idFamAss = idFamAss;
	}
	
	
}