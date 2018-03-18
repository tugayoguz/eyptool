package tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto;

public class EvrakDosyaDTO {
	
	private Long evrakNo;
	
	private Long dosyaNo;
	
	private Long dosyaBolumNo;
	
	private String aciklama;

	//GETTER AND SETTER
	public Long getDosyaNo() {
		return dosyaNo;
	}

	public void setDosyaNo(Long dosyaNo) {
		this.dosyaNo = dosyaNo;
	}

	public Long getDosyaBolumNo() {
		return dosyaBolumNo;
	}

	public void setDosyaBolumNo(Long dosyaBolumNo) {
		this.dosyaBolumNo = dosyaBolumNo;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public Long getEvrakNo() {
		return evrakNo;
	}

	public void setEvrakNo(Long evrakNo) {
		this.evrakNo = evrakNo;
	}
	
	

}
