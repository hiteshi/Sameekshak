package com.cdac.sameekshak.entities;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Administrator database table.
 * 
 */
@Entity
public class Administrator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="admin_id")
	private String adminId;

	@Column(name="admin_email_id")
	private String adminEmailId;

	@Column(name="admin_extn_no")
	private int adminExtnNo;

    @Lob()
	@Column(name="admin_image")
	private byte[] adminImage;

	@Column(name="admin_name")
	private String adminName;

	private String password;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-many association to Role
    @ManyToMany
	@JoinTable(
		name="Role_Administrator"
		, joinColumns={
			@JoinColumn(name="admin_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="role_id")
			}
		)
	private List<Role> roles;

    public Administrator() {
    }

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminEmailId() {
		return this.adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public int getAdminExtnNo() {
		return this.adminExtnNo;
	}

	public void setAdminExtnNo(int adminExtnNo) {
		this.adminExtnNo = adminExtnNo;
	}

	public byte[] getAdminImage() {
		return this.adminImage;
	}

	public void setAdminImage(byte[] adminImage) {
		this.adminImage = adminImage;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}