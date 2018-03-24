package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.BaseDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.BaseDTO;

@Repository
public class BaseDaoImpl<D extends BaseDTO> implements BaseDao<D>{
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	

	@Override
	public BaseDTO insert(BaseDTO d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseDTO update(BaseDTO d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BaseDTO> executeQuery(String queryStr, int firstIndex, int lastIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BaseDTO> executeQuery(String queryStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseDTO executeQueryUniqResult(String queryStr) {
		// TODO Auto-generated method stub
		return null;
	}
 
	//GETTER AND SETTER
	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

}
