package objects;

import java.util.ArrayList;

public class Reservation {
	private Restaurant restaurant;
	private ArrayList <Employee> staff = new ArrayList<Employee>();
	private ArrayList <Meal> menu = new ArrayList<Meal>();
	String date_start;
	String date_end;
	int visitors;
	
	public void addEmployee(Employee e) {
		staff.add(e);
	}
	
	public void addMeal(Meal m) {
		menu.add(m);
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
}
