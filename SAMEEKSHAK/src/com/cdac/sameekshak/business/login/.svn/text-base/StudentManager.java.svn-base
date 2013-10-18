/**
 * 
 */
package com.cdac.sameekshak.business.login;

import java.util.List;

import javax.ejb.Remote;

import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;

/**
 * @author d1153025
 *
 */
@Remote
public interface StudentManager {

	public Student isStudentExist(String userName,String password);
	public byte[] showStudentImage(String studentId);
	public boolean getStudent(String studentId);
	public List<Test> getTests();
	
	public List<Administrator> getAdmin();

	public List<Student> getStudents();
	
}
