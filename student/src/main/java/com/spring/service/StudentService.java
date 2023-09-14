package com.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.repo.StudentRepo;

@Service  
@Transactional  
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
		
	}

	public List<Student> getListOfStu() {
		
		return studentRepo.findAll();
	}

	public Student findByStuId(Long student_id) {
		
		Optional<Student> student= studentRepo.findById(student_id);
		return  student.get();
	}
	
	
	public Student editStuDetails(Student student, Long student_id) {
		student.setStudent_id(student.getStudent_id());
		student.setStudentBranch(student.getStudentBranch());
		student.setStudentName(student.getStudentName());		
		return studentRepo.save(student);
	}

	public void deleteStudent(Long student_id) {
         
		 studentRepo.deleteById(student_id);
		 
	}
	

}
