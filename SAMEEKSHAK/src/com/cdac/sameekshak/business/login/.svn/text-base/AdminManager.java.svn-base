/**
 * 
 */
package com.cdac.sameekshak.business.login;

import java.util.List;

import javax.ejb.Remote;

import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Role;


/**
 * @author d1153025
 *
 */
@Remote
public interface AdminManager {

	public Administrator isAdminExist(String userName,String password);
	public List<Role> setRoles(String adminId);
	public byte[] showAdminImage(String userName);
}
