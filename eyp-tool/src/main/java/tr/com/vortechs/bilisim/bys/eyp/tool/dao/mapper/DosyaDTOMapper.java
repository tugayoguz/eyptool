package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.DosyaDTO;

public class DosyaDTOMapper implements RowMapper<DosyaDTO>{

	@Override
	public DosyaDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		DosyaDTO evrakDosyaDTO = new DosyaDTO();
		evrakDosyaDTO.setId(rs.getLong(""));
		evrakDosyaDTO.setAcanKullanici(rs.getLong(""));
		evrakDosyaDTO.setAciklama(rs.getString(""));
		evrakDosyaDTO.setAcilisTarihi(rs.getString(""));
		evrakDosyaDTO.setBirimArsivSuresi(rs.getInt(""));
		evrakDosyaDTO.setBirimNo(rs.getLong(""));
		evrakDosyaDTO.setDosyaSayi(rs.getString(""));
		evrakDosyaDTO.setDosyaTuru(rs.getString(""));
		evrakDosyaDTO.setDurumu(rs.getString(""));
		evrakDosyaDTO.setKapanacagiTarih(rs.getString(""));
		evrakDosyaDTO.setKapanisTarihi(rs.getString(""));
		evrakDosyaDTO.setKapanmaKriteri(rs.getString(""));
		evrakDosyaDTO.setKapanmaKriteriDegeri(rs.getString(""));
		evrakDosyaDTO.setKapatanKullanici(rs.getLong(""));
		evrakDosyaDTO.setKonuNo(rs.getLong(""));
		evrakDosyaDTO.setKurumArsivSuresi(rs.getInt(""));
		evrakDosyaDTO.setLastUpdateData(rs.getString(""));
		evrakDosyaDTO.setSaklamaOrtami(rs.getString(""));
		evrakDosyaDTO.setSaklamaPlanNo(rs.getLong(""));
		evrakDosyaDTO.setSaklamaYeri(rs.getString(""));
		evrakDosyaDTO.setTanimi(rs.getString(""));
		evrakDosyaDTO.setTumKullanicilar(rs.getString(""));
		evrakDosyaDTO.setYilSonundaKapat(rs.getString(""));
		return evrakDosyaDTO;
	}

}
