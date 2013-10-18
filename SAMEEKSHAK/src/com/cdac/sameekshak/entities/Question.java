package com.cdac.sameekshak.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * The persistent class for the Question database table.
 * 
 */
@Entity
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_id")
	private int questionId;

	@Column(name="evaluation_time")
	private int evaluationTime;

	@Column(name="reading_duration")
	private int readingDuration;

    @Lob()
	private byte[] statement;

	@Column(name="uploaded_by")
	private String uploadedBy;

	//bi-directional many-to-many association to Test
	@ManyToOne
	@JoinColumn(name="tests")
	private Test tests;

	//bi-directional many-to-one association to Test_Case
	@OneToMany(mappedBy="question")
	private List<Test_Case> testCases;

	//bi-directional many-to-one association to Question_Type
    @ManyToOne
	@JoinColumn(name="type_code")
	private Question_Type questionType;

	//bi-directional many-to-many association to Assignment
	@ManyToMany(mappedBy="questions")
	private List<Assignment> assignments;

    public Question() {
    }

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getEvaluationTime() {
		return this.evaluationTime;
	}

	public void setEvaluationTime(int evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	public int getReadingDuration() {
		return this.readingDuration;
	}

	public void setReadingDuration(int readingDuration) {
		this.readingDuration = readingDuration;
	}

	public byte[] getStatement() {
		return this.statement;
	}

	public void setStatement(byte[] statement) {
		this.statement = statement;
	}

	public String getUploadedBy() {
		return this.uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public Test getTests() {
		return this.tests;
	}

	public void setTests(Test tests) {
		this.tests = (Test) tests;
	}
	
	public List<Test_Case> getTestCases() {
		return this.testCases;
	}

	public void setTestCases(List<Test_Case> testCases) {
		this.testCases = testCases;
	}
	
	public Question_Type getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(Question_Type questionType) {
		this.questionType = questionType;
	}
	
	public List<Assignment> getAssignments() {
		return this.assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
}