package objects;

import java.util.Date;

public class Employee {
	private Restaurant restaurant;
	String first_name;
	String last_name;
	String gender; //"M" for male and "F" for female
	Date birthdate;
	String phone;
	String e_mail;
	private Position position;
	private Double wage;
	
	
	
	public Double getWage() {
		return wage;
	}
	public void setWage(Double wage) {
		this.wage = wage;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
