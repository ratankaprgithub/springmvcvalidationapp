package com.cts;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

public class StudentBean implements Serializable{

	
	
	
	

	
	
	
	
	@Min(value=100,message="Roll Number Must be greater than 100")
	private int roll;
	
	
	@NotNull(message="Name is mandatory")
	@Size(min=2,max=5,message="shouuld be min 2 and max 5")
	private String name;
	
	
	@NotEmpty(message="select atleast one course")
	private String[] courses;
	
	
	@AssertTrue(message="Must check this value")
	private boolean isIndian;
	
	@NotNull(message="must select the Gender")
	private String gender;
	
	
	@NotBlank(message ="must select a city")
	private String city;
	
	
	
	
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public boolean getisIndian() {
		return isIndian;
	}

	public void setisIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	private int marks;
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
