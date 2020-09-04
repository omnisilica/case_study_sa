package com.case_study_sa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Site Users")
public class SiteUser {
	
	@Id
//	@NotEmpty(message="Cannot Be Empty")
//	@NotNull(message="Cannot Be Empty")
//	@Size(min =5, max = 14,
//	message="User name must be between {2} and {1}")
	@Column(name="Email", unique=true)
	private String userEmail;
	
	@Column(name = "Username")
	private String userUsername;
	
//	@NotEmpty(message="Cannot Be Empty")
//	@NotNull(message="Cannot Be Empty")
	@Column(name = "Password")
	private String userPassword;
	
	@OneToMany(mappedBy="siteUserVideolist")
	private List<Videolist> userVideolists = new ArrayList<>();
	
	@OneToMany(mappedBy="siteUserDownload")
	private List<Download> userDownloads = new ArrayList<>();
	
	public SiteUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SiteUser(String userEmail/*, String userUsername*/, String userPassword) {
		super();
		this.userEmail = userEmail;
		//this.userUsername = userUsername;
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<Videolist> getUserVideolists() {
		return userVideolists;
	}

	public void setUserVideolists(List<Videolist> userVideolists) {
		this.userVideolists = userVideolists;
	}

	public List<Download> getUserDownloads() {
		return userDownloads;
	}

	public void setUserDownloads(List<Download> userDownloads) {
		this.userDownloads = userDownloads;
	}


	@Override
	public String toString() {
		return "SiteUser [userEmail=" + userEmail + ", userUsername=" + userUsername + ", userPassword=" + userPassword
				+ ", userVideolists=" + userVideolists + ", userDownloads=" + userDownloads + "]";
	}
	
	
	
}
