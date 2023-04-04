package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class SavesStudent {
	public static  void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("ronaldo");
		student1.setEmail("ronaldo@gmail.com");
		
		StudentDao studentDao= new StudentDao();
		Student student= studentDao.savesStudent(student1);
		if(student!=null) {
			System.out.println("Student"+ student.getName()+"added succesfully");
		}
	}

}
