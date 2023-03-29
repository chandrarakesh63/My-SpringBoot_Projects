package SpringJDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Studentdao {
private JdbcTemplate jdbctemplate;
	

	public JdbcTemplate getjdbctemplate() {
		return jdbctemplate;
	}
	

	public void setjdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Student1 s) {
		String query="insert into Student(id,name,city)values(?,?,?)";
		int i = this.jdbctemplate.update(query,s.getId(),s.getName());
		return i;
	}

	public Student1 getsStudent(int studentid) {
		String query="select * from Student where id = ?";
		RowMapper<Student1> rm=(RowMapper<Student1>) new Rowmapperimpl();
		Student1 s=this.jdbctemplate.queryForObject(query, rm,studentid);
		return s;
	}

	public List<Student1> getAllstudent() {
		String query="select * from Student ";
		List<Student1> s1 = this.jdbctemplate.query(query, new Rowmapperimpl());
		return s1;
	}


	public int change(Student1 s) {
		String query="update student set name=? where id=?";
		int i = this.jdbctemplate.update(query,s.getName(),s.getId());
		return i;
		
	}

}
