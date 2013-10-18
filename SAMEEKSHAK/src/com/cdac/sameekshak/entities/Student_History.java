package com.cdac.sameekshak.entities;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the Student_History database table.
 * 
 */
@Entity
public class Student_History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="history_id")
	private int historyId;

	@Column(name="current_code")
	private String currentCode;

	@Column(name="end_time")
	private Time endTime;

	@Column(name="highest_evaluated_code")
	private String highestEvaluatedCode;

	private String ip;

	private BigDecimal percentage;

	@Column(name="start_time")
	private Time startTime;

	//bi-directional many-to-one association to Student
    @ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	//bi-directional many-to-one association to Test
    @ManyToOne
	@JoinColumn(name="test_id")
	private Test test;

    public Student_History() {
    }

	public int getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public String getCurrentCode() {
		return this.currentCode;
	}

	public void setCurrentCode(String currentCode) {
		this.currentCode = currentCode;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getHighestEvaluatedCode() {
		return this.highestEvaluatedCode;
	}

	public void setHighestEvaluatedCode(String highestEvaluatedCode) {
		this.highestEvaluatedCode = highestEvaluatedCode;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public BigDecimal getPercentage() {
		return this.percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
}