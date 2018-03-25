package tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto;

import java.math.BigDecimal;

public class EvrakPostaDTO extends BaseDTO{
	
	private String postaTuru;
	
	private Long evrakMerkezi;
	
	private String birimEvrakNo;
	
	private Long evrakNo;
	
	private String postaTarihi;
	
	private BigDecimal gramaj;
	
	private BigDecimal ucret;
	
	private String gonderenKarsiladi;
	
	private String gonderilenYer;
	
	private String aciklama;
	
	private String barkod;
	
	private String lastUpdateDate;
	
	private String adres;
	
	private String teslimAlan;
	
	private int locked;
	
	private int eYazismaIleGonderildi;
	
	private int kepIleGonderildi;

	public String getPostaTuru() {
		return postaTuru;
	}

	public void setPostaTuru(String postaTuru) {
		this.postaTuru = postaTuru;
	}

	public Long getEvrakMerkezi() {
		return evrakMerkezi;
	}

	public void setEvrakMerkezi(Long evrakMerkezi) {
		this.evrakMerkezi = evrakMerkezi;
	}

	public String getBirimEvrakNo() {
		return birimEvrakNo;
	}

	public void setBirimEvrakNo(String birimEvrakNo) {
		this.birimEvrakNo = birimEvrakNo;
	}

	public Long getEvrakNo() {
		return evrakNo;
	}

	public void setEvrakNo(Long evrakNo) {
		this.evrakNo = evrakNo;
	}

	public String getPostaTarihi() {
		return postaTarihi;
	}

	public void setPostaTarihi(String postaTarihi) {
		this.postaTarihi = postaTarihi;
	}

	public BigDecimal getGramaj() {
		return gramaj;
	}

	public void setGramaj(BigDecimal gramaj) {
		this.gramaj = gramaj;
	}

	public BigDecimal getUcret() {
		return ucret;
	}

	public void setUcret(BigDecimal ucret) {
		this.ucret = ucret;
	}

	public String getGonderenKarsiladi() {
		return gonderenKarsiladi;
	}

	public void setGonderenKarsiladi(String gonderenKarsiladi) {
		this.gonderenKarsiladi = gonderenKarsiladi;
	}

	public String getGonderilenYer() {
		return gonderilenYer;
	}

	public void setGonderilenYer(String gonderilenYer) {
		this.gonderilenYer = gonderilenYer;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTeslimAlan() {
		return teslimAlan;
	}

	public void setTeslimAlan(String teslimAlan) {
		this.teslimAlan = teslimAlan;
	}

	public int getLocked() {
		return locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public int geteYazismaIleGonderildi() {
		return eYazismaIleGonderildi;
	}

	public void seteYazismaIleGonderildi(int eYazismaIleGonderildi) {
		this.eYazismaIleGonderildi = eYazismaIleGonderildi;
	}

	public int getKepIleGonderildi() {
		return kepIleGonderildi;
	}

	public void setKepIleGonderildi(int kepIleGonderildi) {
		this.kepIleGonderildi = kepIleGonderildi;
	}
	
	
	

}
