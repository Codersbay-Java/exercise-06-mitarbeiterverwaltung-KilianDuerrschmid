package application;

public class Department {

	String name;
	int id;
	String country;
	String city;

	/*
	 *
	 * Your code comes here. Remember you can overload constructors.
	 *
	 */

	public Department(String name, int id, String country, String city){
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;

	}

	//default Department
	public Department(){
		name = "Test";
		id = 123;
		country = "Neverland";
		city = "Gotham";
	}

	public boolean isEquals(Department other) {
		return id == other.id;
	}
}
