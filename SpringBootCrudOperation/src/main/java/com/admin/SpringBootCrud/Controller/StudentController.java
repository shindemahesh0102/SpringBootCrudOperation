package com.admin.SpringBootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.SpringBootCrud.bean.Student;
import com.admin.SpringBootCrud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/students")
	public List<Student> getAllStudentDetails() {
		return studentService.getAllSubject();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addSubject(@RequestBody Student addstudent) {

		studentService.addStudentDetails(addstudent);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/{sid}")
	public void UpdateStudentDetails(@PathVariable String sid, @RequestBody Student updateStudentDetails) {

		studentService.updateStudentDetails(sid, updateStudentDetails);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{sid}")
	public void DeleteStudentDetails(@PathVariable String sid) {
		studentService.deleteStudentDetails(sid);
	}

}
