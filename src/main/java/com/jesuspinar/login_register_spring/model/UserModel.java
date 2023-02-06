package com.jesuspinar.login_register_spring.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class UserModel {

	@Id
	@GeneratedValue
	private long id;
	private String email;
	private String password;

	private String name;
	private String surname;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	public UserModel() { }


	public UserModel(String name, String surname, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserModel user = (UserModel) o;
		return id == user.id && email.equals(user.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, email);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
