package com.gsport.app.models;

import java.util.Set;

import javax.persistence.*;

/* Entity User*/

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_user", nullable = false)
	private long id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="user_type", nullable = false)
	private String userType;
	
	
	public User() {}
	
	public User(String name, String email, String password, String phone, String userType) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.userType = userType;
	}
	
	public User(String name, String email, String password, String userType) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}
	
	/* GETTERS AND SETTERS */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	

}
