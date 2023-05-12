package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;



@Entity
public class Comments {

	@Id
	@GeneratedValue
	@Column(name = "Comment_Id")
	private int commentId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Email")
	private String email;

	@Lob
	@Column(name = "Comment")
	private String comment;
	
	@CreationTimestamp
	private LocalDate createdDate;

	
	
	//relationship with post
	@ManyToOne
	@JoinColumn(name = "postId")
	private CreatePostDetails createPostDetails;



	public int getCommentId() {
		return commentId;
	}



	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public LocalDate getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}



	public CreatePostDetails getCreatePostDetails() {
		return createPostDetails;
	}



	public void setCreatePostDetails(CreatePostDetails createPostDetails) {
		this.createPostDetails = createPostDetails;
	}

	
}
