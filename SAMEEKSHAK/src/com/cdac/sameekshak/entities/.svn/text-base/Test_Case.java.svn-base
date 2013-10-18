package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Test_Case database table.
 * 
 */
@Entity
public class Test_Case implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="case_id")
	private int caseId;

	@Column(name="input")
	private String input;

	@Column(name="output")
	private String output;

	private String remarks;

	//bi-directional many-to-one association to Question
    @ManyToOne
	@JoinColumn(name="question_id")
	private Question question;

    public Test_Case() {
    }

	public int getCaseId() {
		return this.caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}