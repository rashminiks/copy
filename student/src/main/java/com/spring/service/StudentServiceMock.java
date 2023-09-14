package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.entity.Student;
import com.spring.repo.ToDoService;

public class StudentServiceMock {
	
	  public ToDoService doService;  
	  
	  

	 public StudentServiceMock(ToDoService doService) {
		
		this.doService = doService;
	}



	public List<Student> getTodosforSpring() {  
         
	        List<Student> retrievedtodos = new ArrayList<Student>(); 
	      
	       
			return retrievedtodos;  
}
}
