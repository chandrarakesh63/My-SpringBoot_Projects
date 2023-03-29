package SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Rowmapperimpl implements RowMapper<Student1>{
	
	public Student1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student1 s=new Student1();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		return s;
	}

}
