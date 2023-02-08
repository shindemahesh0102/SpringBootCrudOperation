package com.admin.SpringBootCrud.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.SpringBootCrud.bean.Student;
import com.admin.SpringBootCrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepo;
	public List<Student> getAllSubject(){
		
		List<Student> student=new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		return student;
		
	}
	public void addStudentDetails(Student addStudentDetails) {
		//create new object add to database
		studentRepo.save(addStudentDetails);
		
	}
	//we can used save method for add and update to the database
	//if you save data its check 1st than save its
	//check present id database is present if present they update its
	//if not present they save it
	public void updateStudentDetails(String sid,Student updateStudentDetails) {
		studentRepo.save(updateStudentDetails);
		
	}
	public void deleteStudentDetails(String sid) {
		studentRepo.deleteById(sid);
		
	}
	
	

}
