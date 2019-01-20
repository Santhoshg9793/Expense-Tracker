/**
 * 
 */
package com.user.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Santhosh
 *
 */
@Entity
@Table(name="user" ,schema="taskmng")
public class UserBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotEmpty(message = "First name cannot be null for a user")
	@Pattern(regexp = "^.*[A-Za-z].*$", message = "User name cannot contain numbers and special characters.")
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	

	@Column(name = "gender")
	private String gender;


	@NotNull
	@Email(message="Please provide a valid Email address")
	@Column(name = "primary_email")
	private String primaryEmailId;
	
	
	@Email(message="Please provide a valid Email address")
	@Column(name = "secondary_email")
	private String secondaryEmailId;

	@Column(name = "created_ts")
	private Timestamp createdTs;

	@Column(name = "updated_ts")
	private Timestamp updatedTs;

	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	@Column(name = "secret_key")
	private String secretKey;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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



	public Timestamp getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	public Timestamp getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(Timestamp updatedTs) {
		this.updatedTs = updatedTs;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}

	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}
	
	

}
