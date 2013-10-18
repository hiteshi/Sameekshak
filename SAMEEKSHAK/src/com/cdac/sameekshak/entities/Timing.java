package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Timing database table.
 * 
 */
@Entity
public class Timing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_id")
	private String studentId;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	@Column(name="time_remaining")
	private int timeRemaining;

	//bi-directional one-to-one association to Student
	@OneToOne(mappedBy="timing")
	private Student student;

    public Timing() {
    }

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getTimeRemaining() {
		return this.timeRemaining;
	}

	public void setTimeRemaining(int timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}