package com.crud.bean;

import javax.persistence.*;

@Entity
@Table(name= "student" )
public class Student {
	private int id;
	private String name;
	private String email;
	private String password;
	private String phone;
	
	public Student() {}
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	public Student(int id)
	{
		this.id=id;
	}
	public Student(String name, String email, String password, String phone)
	{
		this.name=name;
		this.email=email;
		this.password=password;
		this.phone=phone;
	}
	public Student(int id, String name, String email, String password, String phone)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		this.phone=phone;
	}
	
}
