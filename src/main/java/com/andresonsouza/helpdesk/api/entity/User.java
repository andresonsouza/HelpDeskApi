package com.andresonsouza.helpdesk.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.andresonsouza.helpdesk.api.enums.ProfileEnum;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@Column(name = "Email")
	private String id;
	
	private String email;
	
	private String password;
	
	private ProfileEnum pofile;

	public ProfileEnum getProfile() {
		return pofile;
	}

	public void setPofile(ProfileEnum pofile) {
		this.pofile = pofile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
