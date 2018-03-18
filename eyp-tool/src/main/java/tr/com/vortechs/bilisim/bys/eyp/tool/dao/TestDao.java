package tr.com.vortechs.bilisim.bys.eyp.tool.dao;

import java.nio.channels.NonWritableChannelException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public void testInsert()
	{
		String query="insert into users values (:id,:name,:email)";  
		  
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("id",4);  
		map.put("name","test");  
		map.put("email","test");  
		template.execute(query,map,new PreparedStatementCallback() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});  
	}
	
	
	public List<TestDTO> testSelect()
	{
		String query = "select * from users";
		List<TestDTO> dtoList = template.query(query, new HashMap<String,String>(), new RowMapper<TestDTO>() 
		{
			@Override
			public TestDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				TestDTO dto = new TestDTO();
				System.out.println(arg1);
				dto.setId(rs.getInt("id"));
				dto.setMail(rs.getString("email"));
				dto.setName(rs.getString("name"));
				return dto;
			}
		});
		return dtoList;
	}
}
