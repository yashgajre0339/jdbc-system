package com.jsp.student.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class StudentDao {
	
	HelperClass helperclass = new HelperClass();
	
	public Student savesStudent(Student student) {
		Connection connection = helperclass.getConnection();
		String sql ="INSERT INTO student VALUES (?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, student.getId());
			
			preparedStatement.setString(2, student.getName());
			
			preparedStatement.setString(3, student.getEmail());
			
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return student;
	}



}
