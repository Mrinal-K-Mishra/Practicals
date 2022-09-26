package com.maven.dto;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmployeeDto {

	@Id	//primary key
	@GeneratedValue(strategy = GenerationType.AUTO)	//auto increment
	private int eid;
	
	@Column(length = 20, nullable = false)
	@NotNull(message = "please enter your name")
	private String ename;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotNull(message = "please enter your mobile number")
	private long ephone;
	
	@Column(length = 10, nullable = false)
	@NotNull(message = "please enter your salary")
	private double esalary;
	
	@Column(length = 50)
	@NotNull(message = "please enter your address")
	private String addr;
	
	@Column(length = 20, nullable = false, unique = true)
	@NotNull(message = "please enter your email")
	@Email(message = "please enter proper email id")
	private String email;
	
}