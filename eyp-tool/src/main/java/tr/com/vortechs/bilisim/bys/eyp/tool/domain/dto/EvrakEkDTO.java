package tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto;

public class EvrakEkDTO extends BaseDTO{
	
	private Long evrakNo;
	
	private String ek;
	
	private Long icerikDosyaNo;
	
	private String lastUpdateDate;
	
	private String ekImzalanir;
	
	private String ekSurumlenebilir;
	
	private EvrakIcerikDTO evrakIcerikDTO;
	
	//GETTER AND SETTER
	public Long getEvrakNo() {
		return evrakNo;
	}

	public void setEvrakNo(Long evrakNo) {
		this.evrakNo = evrakNo;
	}

	public String getEk() {
		return ek;
	}

	public void setEk(String ek) {
		this.ek = ek;
	}

	public Long getIcerikDosyaNo() {
		return icerikDosyaNo;
	}

	public void setIcerikDosyaNo(Long icerikDosyaNo) {
		this.icerikDosyaNo = icerikDosyaNo;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getEkImzalanir() {
		return ekImzalanir;
	}

	public void setEkImzalanir(String ekImzalanir) {
		this.ekImzalanir = ekImzalanir;
	}

	public String getEkSurumlenebilir() {
		return ekSurumlenebilir;
	}

	public void setEkSurumlenebilir(String ekSurumlenebilir) {
		this.ekSurumlenebilir = ekSurumlenebilir;
	}

	public EvrakIcerikDTO getEvrakIcerikDTO() {
		return evrakIcerikDTO;
	}

	public void setEvrakIcerikDTO(EvrakIcerikDTO evrakIcerikDTO) {
		this.evrakIcerikDTO = evrakIcerikDTO;
	}
	
	
}
