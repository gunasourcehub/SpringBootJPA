package com.liudonghua.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String firstName;
	private String secondName;
	private String date;

	public User() {
		super();
	}

	public User(String firstName, String secondName, String date) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.date = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
