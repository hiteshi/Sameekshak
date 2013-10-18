/**
 * 
 */
package com.cdac.sameekshak.business.profile;

import java.util.List;

import javax.ejb.Remote;

import com.cdac.sameekshak.entities.Role;

/**
 * @author Group-5
 *
 */
@Remote
public interface CourseAdminProfileManager {
	
	public boolean createStudent(List fileItems,String imagePath,String createStudentPath);
	public boolean createAdmin(List fileItems,String imagePath,String createAdminPath, List<Role> roleList);
}
