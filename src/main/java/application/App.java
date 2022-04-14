package application;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Department test = new Department();
        Employee employee1 = new Employee();
        employee1.print();

        Department accounting = new Department("Accounting", generateID(), "Austria", "Linz");
        Employee employee2 = new Employee(accounting, "Maria", "Musterfrau", 123);
        employee2.print();

        System.out.println(employee1.isEquals(employee2));
        System.out.println(test.isEquals(accounting));

		application();
    }


    private static int generateID() {
        Random rand = new Random();
        int upperbound = 201;

		return rand.nextInt(upperbound);
    }


    private static void application() {
		Scanner scanner = new Scanner(System.in);





		System.out.println("Bitte legen Sie eine neue Abteilung an:");

		System.out.println();

		System.out.print("Name ");
		String nameDep = scanner.nextLine();
		System.out.print("Land ");
		String country = scanner.nextLine();
		System.out.print("Stadt ");
		String city = scanner.nextLine();

		System.out.println();

		System.out.println("Bitte legen Sie einen Mitarbeiter an:");

		System.out.println();

		System.out.print("Vorname ");
		String firstName = scanner.nextLine();
		System.out.print("Nachname ");
		String lastName = scanner.nextLine();

		System.out.println();

		Department newdep = new Department(nameDep, generateID(), country, city);
		Employee employeeNew = new Employee(newdep, firstName, lastName, generateID());

		System.out.println("Sie haben folgenden Mitarbeiter angelegt:");

		employeeNew.print();


		choice(scanner);

    }

	public static void choice(Scanner scanner){
		System.out.println("""
				Möchten Sie noch einen Mitarbeiter anlegen?
				j für ja und n für beenden
				""");

		char choice = scanner.next().charAt(0);

		if (choice == 'j'){
			application();
		} else if ( choice == 'n'){
			System.out.println("Auf Wiedersehen!");
			System.exit(0);
		} else {
			System.out.println("Ungültige Eingabe!");
			System.out.println();
			choice(scanner);
		}
	}
}
