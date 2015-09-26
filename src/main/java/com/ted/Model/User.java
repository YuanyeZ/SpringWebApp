 package com.ted.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@Column(name="ID", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	
	@Column(name="NAME")
	private String userName;
	
	public User(){}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString(){
		return "ID = " + ID + ", User = " + userName;
	}
		
}
