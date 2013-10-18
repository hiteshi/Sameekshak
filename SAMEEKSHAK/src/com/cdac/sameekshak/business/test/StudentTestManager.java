package com.cdac.sameekshak.business.test;

import java.util.List;

import javax.ejb.Remote;

import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Test_Case;

@Remote
public interface StudentTestManager {
	
	public void viewPdfQuestion(String studentId, int testId);
	public Question getQuestionObject(int questionId);
	public String compileSaveCode(String fileName,String code,String input,int questionId,String saveFilePatth);
	public List<Test_Case> getNumberofEvaluationCases (int questionId);
	public String submitCode(String fileName,String code);
}
