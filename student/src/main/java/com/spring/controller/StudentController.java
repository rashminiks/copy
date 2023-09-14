package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;
import com.spring.service.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api") 
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("save-stu")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println(student+">>>>>>>>>>>>>>>");
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping("get-stu-list")
	public List<Student> getStudentsList(){
		return studentService.getListOfStu();
		
	}
	
	@GetMapping("stu/{id}")
	public Student findByStuId(@PathVariable("id") Long student_id) {
		return studentService.findByStuId(student_id);
		
	}
	
	@PostMapping("edit_stu_details/{student_id}")
	public Student updateStuDetails(@RequestBody Student student,@PathVariable("student_id") Long student_id) {
		return studentService.editStuDetails(student,student_id);
	}
		
	

    
  @DeleteMapping("delete-student/{student_id}")  
  public void deleteStudent(@PathVariable("student_id") Long student_id) {  
	  studentService.deleteStudent(student_id);  
  }	

	

}
