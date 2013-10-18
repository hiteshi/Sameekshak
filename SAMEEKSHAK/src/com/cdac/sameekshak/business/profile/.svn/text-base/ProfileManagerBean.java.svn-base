/**
 * 
 */
package com.cdac.sameekshak.business.profile;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.fileupload.FileItem;
import org.jboss.ejb3.annotation.RemoteBinding;

import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Course;
import com.cdac.sameekshak.entities.Role;
import com.cdac.sameekshak.entities.Student;

/**
 * @author Group-5
 * 
 */
@Stateless
@RemoteBinding(jndiBinding = "ProfieManagerBean")
public class ProfileManagerBean implements TestAdminProfileManager,
		FacultyAdminProfileManager, CourseAdminProfileManager {

	List files;
	// Adding a persistence context to map to the db to the entitymanager so as
	// to allow jboss to gain control
	@PersistenceContext(unitName = "sameekshak_persistence_context")
	private EntityManager entityManager;

	@Override
	public boolean createStudent(List fileItems, String filePath,
			String createStudentPath) {
		// code to create student account in sameekshak
		File file;
		files = fileItems;
		try {
			Iterator i = fileItems.iterator();
			Student student = new Student();
			FileItem fi = (FileItem) i.next();
			// System.out.println("////////////////////////////////////// "+fi.getString());
			student.setStudentId(fi.getString());
			student.setUserName(fi.getString());
			student.setPassword(fi.getString());
			Calendar calendar = new GregorianCalendar();
			int year = calendar.get(Calendar.YEAR);
			student.setEnrolledYear(year);
			fi = (FileItem) i.next();
			// System.out.println("////////////////////////////////////// "+fi.getString());
			Course course = entityManager.find(Course.class,
					Integer.parseInt(fi.getString()));
			student.setCourse(course);
			fi = (FileItem) i.next();
			// System.out.println("////////////////////////////////////// "+fi.getString());
			student.setStudentName(fi.getString());
			fi = (FileItem) i.next();
			// System.out.println("////////////////////////////////////// "+fi.getString());
			student.setStudentEmailId(fi.getString());
			fi = (FileItem) i.next();
			student.setStudentPhoneNo(new BigDecimal(fi.getString()));
			// System.out.println("////////////////////////////////////// "+fi.getString());
			fi = (FileItem) i.next();
			// System.out.println("////////////////////////////////////// "+fi.getString());

			if (!fi.isFormField()) {
				try {
					String fileName = fi.getName();
					file = new File(filePath
							+ fileName.substring(fileName.lastIndexOf("/") + 1));
					fi.write(file);
					byte[] b = new byte[(int) file.length()];
					FileInputStream fileInputStream = new FileInputStream(file);
					fileInputStream.read(b);
					student.setStudentImage(b);
					entityManager.persist(student);
					createFolder(createStudentPath, student.getStudentId());
					file.delete();
				} catch (Exception e) {
					System.out
							.println("exception in question file writting....");
					return false;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception in createStudent :" + e);
			return false;
		}

		return true;
	}

	public void createFolder(String path, String username) {

		try {

			// --------------------------create-users-in-server----------------------------------------//

			// ---------------------------------------------------------------------------------------//

			path = path + username;
			String assignment = path + "/Assignment";
			String test = path + "/Test";
			boolean success1 = (new File(assignment)).mkdirs();
			boolean success2 = (new File(test)).mkdirs();
			if (success1 && success2) {
				System.out.println("Directory: " + test + " created");
				System.out.println("Directory: " + assignment + " created");
			}

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

	@Override
	public boolean createAdmin(List fileItems, String imagePath,
			String createAdminPath,List<Role> roleList ) {
		// code to create admin account in sameekshak
		File file;
		files = fileItems;
		try {
			Iterator i = fileItems.iterator();
			Administrator admin = new Administrator();
			FileItem fi = (FileItem) i.next();
			System.out.println("////////////////////////////////////// "
					+ fi.getString());
			admin.setAdminId(fi.getString());
			admin.setPassword(fi.getString());
			admin.setUserName(fi.getString());
			fi = (FileItem) i.next();
			admin.setAdminName(fi.getString());

			fi = (FileItem) i.next();
			System.out.println("////////////////////////////////////// "
					+ fi.getString());
			admin.setAdminEmailId(fi.getString());

			fi = (FileItem) i.next();
			System.out.println("////////////////////////////////////// "
					+ fi.getString());
			admin.setAdminExtnNo(Integer.parseInt((fi.getString())));

			fi = (FileItem) i.next();			
			if (!fi.isFormField()) {
				try {
					String fileName = fi.getName();
					System.out
							.println("//////////////////////////////////////////image1");
					file = new File(imagePath
							+ fileName.substring(fileName.lastIndexOf("/") + 1));
					fi.write(file);
					byte[] b = new byte[(int) file.length()];
					System.out
							.println("//////////////////////////////////////////image2");
					FileInputStream fileInputStream = new FileInputStream(file);
					fileInputStream.read(b);
					System.out
							.println("//////////////////////////////////////////image3");
					admin.setAdminImage((b));
					entityManager.persist(admin);
					System.out.println("Admin created...");
					// createFolder(createAdminPath,admin.getAdminId());
					file.delete();
				} catch (Exception e) {
					System.out
							.println("exception in question file writting....");
					return false;
				}
			}
			List<Administrator> adminList=new ArrayList<Administrator>(0);
			adminList.add(admin);
			admin.setRoles(roleList);
			
			entityManager.merge(admin);
			
		} catch (Exception e) {
			System.out.println("Exception in createStudent :" + e);
			return false;
		}

		return true;
	}
}
