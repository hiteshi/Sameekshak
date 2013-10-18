package com.cdac.sameekshak.business.test;

import java.util.List;

import javax.ejb.Remote;

import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Question_Type;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.entities.Test_Case;


/**
 * @author Group-5
 *
 */
@Remote
public interface CourseAdminTestManager {
	
	
	public boolean scheduleTest(Test scheduleTest);
	public boolean reScheduleTest(Test scheduleTest, int testId);
	public boolean uploadFile(List fileItems, String filePath,Administrator admin);
	public Question_Type findType(int code);
	public List<Student> eligibleStudent(int testId);
	public Test getTestObject(int testId);
	public List<Student> getEnrolledStudents(int year);

	public List<Question> getQuestionList(int testId);
	public boolean downloadQuestionPDF(int questId,String downloadPath);
	
	public boolean uploadEligibleStudent(String[] students, String testId);
	public void cancelTest(int testId);
	
	public Test getTestObjectStartTest(int testId);
}
