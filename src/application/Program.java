package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> people = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+ i + " data: ");
			System.out.print("Natural or Legal (N/L)? ");
			char check = sc.next().charAt(0);
			check = Character.toUpperCase(check);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Income Anual: ");
			double income = sc.nextDouble();
			if (check == 'N') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				people.add(new NaturalPerson(name, income, health));
			} else if (check == 'L') {
				System.out.print("Number of employees: ");
				int number = sc.nextInt();
				people.add(new LegalPerson(name, income, number));
			}
			
		}
		
		double total = 0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person p : people) {
			System.out.println(p);
			total += p.Tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		sc.close();
		
	}

}
