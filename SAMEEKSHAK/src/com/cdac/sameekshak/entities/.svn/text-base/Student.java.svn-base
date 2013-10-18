package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the Student database table.
 * 
 */
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_id")
	private String studentId;

	@Column(name="enrolled_year")
	private int enrolledYear;

	private String password;

	@Column(name="student_email_id")
	private String studentEmailId;

    @Lob()
	@Column(name="student_image")
	private byte[] studentImage;

	@Column(name="student_name")
	private String studentName;

	@Column(name="student_phone_no")
	private BigDecimal studentPhoneNo;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-many association to Test
    @ManyToMany
	@JoinTable(
		name="Student_Test"
		, joinColumns={
			@JoinColumn(name="student_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="test_id")
			}
		)
	private List<Test> tests;
    
	//bi-directional many-to-many association to Assignment
	@ManyToMany(mappedBy="students")
	private List<Assignment> assignments;

	//bi-directional many-to-one association to Course
    @ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	//bi-directional one-to-one association to Timing
	@OneToOne
	@JoinColumn(name="student_id")
	private Timing timing;

    public Student() {
    }

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getEnrolledYear() {
		return this.enrolledYear;
	}

	public void setEnrolledYear(int enrolledYear) {
		this.enrolledYear = enrolledYear;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentEmailId() {
		return this.studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public byte[] getStudentImage() {
		return this.studentImage;
	}

	public void setStudentImage(byte[] studentImage) {
		this.studentImage = studentImage;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public BigDecimal getStudentPhoneNo() {
		return this.studentPhoneNo;
	}

	public void setStudentPhoneNo(BigDecimal studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	public List<Assignment> getAssignments() {
		return this.assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Timing getTiming() {
		return this.timing;
	}

	public void setTiming(Timing timing) {
		this.timing = timing;
	}
	
}