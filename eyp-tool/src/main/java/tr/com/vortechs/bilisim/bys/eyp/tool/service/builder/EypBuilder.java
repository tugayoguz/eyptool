package tr.com.vortechs.bilisim.bys.eyp.tool.service.builder;

import java.util.List;

import dpt.eYazisma.tipler.Paket;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;

public interface EypBuilder {

	EypBuilder addHedef() throws Exception ;
	EypBuilder addImza() throws Exception ;
	EypBuilder addDagitim() throws Exception ;
	EypBuilder setEvrakOlusturan() throws Exception ;
	EypBuilder addEvrak(EvrakDTO evrak) throws Exception ;
	EypBuilder addEk(List<EvrakEkDTO> ekler)  throws Exception ;
	Paket buildInstance()  throws Exception ;
}
