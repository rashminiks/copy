package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int student_id;
	
	@Column(name="student_name")
	private String studentName;
	
	
	@Column(name="student_email")
	private String studentEmail;
	
	@Column(name="student_branch")
	private String studentBranch;

	public Student() {
		super();
	}
	
	

	public Student(int id, String studentName, String studentEmail, String studentBranch) {
		super();
		this.student_id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentBranch = studentBranch;
	}



	

	public int getStudent_id() {
		return student_id;
	}



	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}



	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentBranch=" + studentBranch + "]";
	}
	
	

}
