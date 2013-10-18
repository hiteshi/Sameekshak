package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Question_Type database table.
 * 
 */
@Entity
public class Question_Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="type_code")
	private int typeCode;

	private String description;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="questionType")
	private List<Question> questions;

    public Question_Type() {
    }

	public int getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
}