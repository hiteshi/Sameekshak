package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Assignment database table.
 * 
 */
@Entity
public class Assignment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assignment_id")
	private int assignmentId;

    @Temporal( TemporalType.DATE)
	@Column(name="last_date")
	private Date lastDate;

	private String name;

	private String remarks;

	//bi-directional many-to-many association to Question
    @ManyToMany
	@JoinTable(
		name="Assignment_Question"
		, joinColumns={
			@JoinColumn(name="assignment_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="question_id")
			}
		)
	private List<Question> questions;

	//bi-directional many-to-many association to Student
    @ManyToMany
	@JoinTable(
		name="Student_Assignment"
		, joinColumns={
			@JoinColumn(name="assignment_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="student_id")
			}
		)
	private List<Student> students;

    public Assignment() {
    }

	public int getAssignmentId() {
		return this.assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public Date getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}