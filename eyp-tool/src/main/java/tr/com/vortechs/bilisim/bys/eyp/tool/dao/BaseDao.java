package tr.com.vortechs.bilisim.bys.eyp.tool.dao;

import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.BaseDTO;

public interface BaseDao<D extends BaseDTO> {
	BaseDTO insert(BaseDTO d);
	BaseDTO update(BaseDTO d);
	List<BaseDTO> executeQuery(String queryStr,int firstIndex,int lastIndex);
	List<BaseDTO> executeQuery(String queryStr);
	BaseDTO executeQueryUniqResult(String queryStr);
}
