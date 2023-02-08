package com.admin.SpringBootCrud.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.admin.SpringBootCrud.bean.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	
	

}
