package com.ashokit.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class CreatePostDetails {
	
	@Id
	@GeneratedValue
	@Column(name="Post_Id")
	private Integer postId;
	
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Content")
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	
	
	@UpdateTimestamp
	private LocalDate updateOn;
	
	
	@Column(name = "deleted")
    private Integer deleted =0;
	
	
	
	//relationship with user
	  @ManyToOne
	  @JoinColumn(name = "userId")
	  private UserRegistration userRegistration;
	
	 //relationship with comment
	@OneToMany(cascade = CascadeType.REMOVE,fetch =FetchType.EAGER,mappedBy ="createPostDetails")
	private List<Comments> comments ;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDate updateOn) {
		this.updateOn = updateOn;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}


	
	
	
	
	
	
	
}
