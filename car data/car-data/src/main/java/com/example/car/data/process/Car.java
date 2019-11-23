package com.example.car.data.process;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	String Model_name;
	int year_of_registration;
	int seating_capacity;
	double cost_per_day;
	double mileage;
	String picode;
	long contact_number;
	String mail_id;
	
	public Car(String model_name, int year_of_registration, int seating_capacity, double cost_per_day, double mileage,
			String picode, long contact_number, String mail_id) {
		super();
		Model_name = model_name;
		this.year_of_registration = year_of_registration;
		this.seating_capacity = seating_capacity;
		this.cost_per_day = cost_per_day;
		this.mileage = mileage;
		this.picode = picode;
		this.contact_number = contact_number;
		this.mail_id = mail_id;
	}
	public Car() {
		super();
	}
	public String getModel_name() {
		return Model_name;
	}
	public void setModel_name(String model_name) {
		Model_name = model_name;
	}
	public int getYear_of_registration() {
		return year_of_registration;
	}
	public void setYear_of_registration(int year_of_registration) {
		this.year_of_registration = year_of_registration;
	}
	public int getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	public double getCost_per_day() {
		return cost_per_day;
	}
	public void setCost_per_day(double cost_per_day) {
		this.cost_per_day = cost_per_day;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getPicode() {
		return picode;
	}
	public void setPicode(String picode) {
		this.picode = picode;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	
	public String toString()
	{
		return "model name : "+Model_name+ " year of registration : "+year_of_registration+" seating capacity : "+seating_capacity+" cost per day : "+cost_per_day+" mileage : "+mileage+" contact number : "+contact_number+" pincode "+picode+" mail id "+mail_id;
	}
	
	
}
