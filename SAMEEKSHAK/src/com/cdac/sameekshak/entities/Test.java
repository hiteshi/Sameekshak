package com.cdac.sameekshak.entities;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


/**
 * The persistent class for the Test database table.
 * 
 */
@Entity
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="test_id")
	private int testId;

	@Column(name="conducted_by")
	private String conductedBy;

	private int duration;

	private String name;

	private String remarks;

	private String status;

	@Column(name="scheduled_by")
	private String scheduledBy;

	@Column(name="scheduled_date")
	private Date scheduledDate;

	@Column(name="scheduled_time")
	private Time scheduledTime;

	//bi-directional many-to-many association to Student
	@ManyToMany(mappedBy="tests")
	private List<Student> students;

	//bi-directional one-to-many association to Question
	@OneToMany(mappedBy="tests")
	private List<Question> questions;

	public Test() {
	}

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getConductedBy() {
		return this.conductedBy;
	}

	public void setConductedBy(String conductedBy) {
		this.conductedBy = conductedBy;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getScheduledBy() {
		return this.scheduledBy;
	}

	public void setScheduledBy(String scheduledBy) {
		this.scheduledBy = scheduledBy;
	}

	public Date getScheduledDate() {
		return this.scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public Time getScheduledTime() {
		return this.scheduledTime;
	}

	public void setScheduledTime(Time scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}