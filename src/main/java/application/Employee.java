package application;

public class Employee {
	final Department dept;

	String firstName;
	String lastName;
	int id;


	public Employee(Department dept, String firstName, String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dept = dept;
	}

	public Employee(){
		firstName = "Max";
		lastName = "Mustermann";
		id = 123;
		dept = new Department();
	}



	/*
	 *
	 * Your code comes here. Remember you can overload constructors.
	 *
	 */
	public void print() {
		System.out.println("Der Mitarbeiter " + id + " " + firstName + " " + lastName + " arbeitet in der Abteilung " + dept.name + " in " + dept.city);
	}

	public boolean isEquals(Employee other) {
		return id == other.id;
	}
}
