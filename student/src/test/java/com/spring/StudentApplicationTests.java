package com.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.entity.Student;
import com.spring.service.StudentService;
import com.spring.service.StudentServiceMock;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class StudentApplicationTests {

	@Autowired
	private StudentService studentService;
	

	@Test
	void contextLoads() {
	}

	@Test
	void testsaveStudent() {
		Student s = new Student(12, "rahul", "rahul@mail.com", "it");
		Student savedStuDetails = studentService.saveStudent(s);
		assertThat(savedStuDetails.getStudentName()).isNotNull();

	}
	
//	@Test
//	void testgetList() {
//		   StudentStub doServiceStub = new StudentStub(); 
//		   StudentServiceMock business =new StudentServiceMock(doServiceStub);
//		   List<Student> retrievedtodos = business.getTodosforSpring();
//		   assertEquals(2, retrievedtodos.size());  
//	       System.out.println(" Stub is working correctly...!!");  
//	       }  
	}



