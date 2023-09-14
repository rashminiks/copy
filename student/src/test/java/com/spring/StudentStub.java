package com.spring;

import java.util.Arrays;
import java.util.List;

import com.spring.entity.Student;
import com.spring.repo.ToDoService;

public class StudentStub implements ToDoService{
	
	

	@Override
	public List<Student> getTodosforSpring() {
		Student s=new Student(1,"rai","rai@mail.com","cse");
		Student s1=new Student(2, "raj","raj@mail.com","it");
		return  Arrays.asList(s,s1);
	}

}
