/**
 * 
 */
package com.cdac.sameekshak.business.login;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.bsf.Main;
import org.jboss.ejb3.annotation.RemoteBinding;

import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Role;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.helper.SendMail;

/**
 * @author Group-5
 *
 */
@Stateless
@RemoteBinding(jndiBinding = "LoginManager")
public class UserManagerBean implements StudentManager, AdminManager {

	// Adding a persistence context to map to the db to the entitymanager so as
	// to allow jboss to gain control
	@PersistenceContext(unitName = "sameekshak_persistence_context")
	private EntityManager entityManager;

	@Override
	public Administrator isAdminExist(String userNameLocal, String passwordLocal) {
		// TODO Auto-generated method stub

		try {

			Query adminQuery = entityManager
					.createQuery("from Administrator admin where admin.userName=:userNameLocal and admin.password=:passwordLocal");

			// comment next line to remove debugging
			System.out.println("logging : isAdminExist : adminId = "
					+ userNameLocal + " password = " + passwordLocal);

			adminQuery.setParameter("userNameLocal", userNameLocal);
			adminQuery.setParameter("passwordLocal", passwordLocal);

			Administrator localAdminObject = (Administrator) adminQuery
					.getSingleResult();

			return localAdminObject;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;

		}

	}

	// --------------------- end of isAdminExist --------------

	@Override
	public Student isStudentExist(String userNameLocal, String passwordLocal) {
		// TODO Auto-generated method stub

		System.out
				.println("logging : isStudentExist : b4 try block : userName = "
						+ userNameLocal + " password = " + passwordLocal);

		try {

			Query studentQuery = entityManager
					.createQuery("from Student student where student.userName=:userNameLocal and student.password=:passwordLocal");

			// Query studentQuery = entityManager
			// .createQuery("from Student a where a.userName=:userNameLocal and a.password=:passwordLocal");

			// comment next line to remove debugging
			System.out.println("logging : isStudentExist : userName = "
					+ userNameLocal + " password = " + passwordLocal);

			studentQuery.setParameter("userNameLocal", userNameLocal);
			studentQuery.setParameter("passwordLocal", passwordLocal);

			Student localStudentObject = (Student) studentQuery
					.getSingleResult();

			return localStudentObject;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;

		}
	}

	// -------------------- end of isStudentExist --------------

	@Override
	public List<Role> setRoles(String adminId) {
		// TODO Auto-generated method stub

		Administrator currentAdmin = entityManager.find(Administrator.class,
				adminId);
		List<Role> listOfRoles = currentAdmin.getRoles();
		listOfRoles.size();

		return listOfRoles;

	}

	@Override
	public byte[] showStudentImage(String studentId) {
		// this section is to show the profile picture of students
		byte[] rb = null;
		try {
			Student localStudentObject = entityManager.find(Student.class,
					studentId);
			rb = localStudentObject.getStudentImage();
			System.out.println(rb);
			return rb;

		} catch (Exception e) {
			return rb;
		}

	}

	@Override
	public byte[] showAdminImage(String adminId) {
		// this section is to show the profile picture of administrators
		byte[] rb = null;
		try {
			Administrator localAdminObject = entityManager.find(
					Administrator.class, adminId);
			rb = localAdminObject.getAdminImage();
			System.out.println(rb);
			return rb;

		} catch (Exception e) {
			return rb;
		}
	}

	@Override
	public boolean getStudent(String studentId) {
		// To change student password
		//System.out.println("111");
		Student student = entityManager.find(Student.class, studentId);
		//SendMail sm = new SendMail();
		String content = "Hi " + student.getStudentName() + "\n\n\t\tYour "
				+ "Username : " + student.getUserName() + "\n\t\tPassword : "
				+ student.getPassword() + "\n\n"
				+ "regards,\nSameekshak\nsameekshak.test@gmail.com";
		String subject = "Sameekshak Forgot Password Alert";
		System.out.println(student.getStudentEmailId());
		//sm.sendMail(student.getStudentEmailId(), content, subject);
		SendMail.Main(student.getStudentEmailId(), content, subject);
		return true;
	}

	@Override
	public List<Test> getTests() {
		// get all the test details from database

		try {
			System.out.println(" populateTest() invoked ... ");
			Query query = entityManager
					.createQuery("from Test order by scheduled_date");
			List<Test> tests = (ArrayList<Test>) query.getResultList();
			return tests;

		} catch (NoResultException e) {
			System.out
					.println("Exception because of test uable to retrieve...");
			return null;
		}
	}

	@Override
	public List<Administrator> getAdmin() {
		try {
			Query query = entityManager.createQuery("from Administrator");
			List<Administrator> Administrators=(ArrayList<Administrator>)query.getResultList();
			return Administrators;

		} catch (NoResultException e) {
			System.out.println("Exception because of Administrator uable to retrieve...");
			return null;
		}
	}

	@Override
	public List<Student> getStudents() {
		try {
			Query query = entityManager.createQuery("from Student");
			List<Student> Students=(ArrayList<Student>)query.getResultList();
			return Students;

		} catch (NoResultException e) {
			System.out.println("Exception because of Student uable to retrieve...");
			return null;
		}
	}

	
}
