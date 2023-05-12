package com.ashokit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity

public class UserRegistration {

	@Id
	@GeneratedValue
	private int userId;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Email")
	private String email;

	@Column(name = "Password")
	private String password;

	
	
	// relationship with post
	@OneToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER,mappedBy ="userRegistration")
	private List<CreatePostDetails> createPostDetails;



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
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



	public List<CreatePostDetails> getCreatePostDetails() {
		return createPostDetails;
	}



	public void setCreatePostDetails(List<CreatePostDetails> createPostDetails) {
		this.createPostDetails = createPostDetails;
	}
	
	

}
