package com.addressbookuc3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystemUC3 {
	public static void add(String firstName, String lastName, String address, String city, String state, String zipcode, String number, String email) {
		ArrayList<String> list = new ArrayList<>();
		list.add(firstName);
		list.add(lastName);
		list.add(address);
		list.add(city);
		list.add(state);
		list.add(zipcode);
		list.add(number);
		list.add(email);

		for(int i = 0; i < list.size(); i++) {
			System.out.println("\nContact1 Added.......\n");
			System.out.println("Before editing the Address Book: " +list);
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the latest last name :");
			String fName = scan.nextLine();
			list.set(1, fName);
			System.out.println("\nEditied Successfully.......\n");
			System.out.println("After editing the Address Book: " +list);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("|| Enter the Address details ||");
		System.out.println("---------------------------------------------------------");
		System.out.print("Enter the first name :");
		String firstName = sc.nextLine();
		System.out.print("Enter the last name :");
		String lastName = sc.nextLine();
		System.out.print("Enter the address :");
		String address = sc.nextLine();
		System.out.print("Enter the city :");
		String city = sc.nextLine();
		System.out.print("Enter the state :");
		String state = sc.nextLine();
		System.out.print("Enter the Zip code :");
		String zipcode = sc.nextLine();
		System.out.print("Enter the contact number :");
		String number = sc.nextLine();
		System.out.print("Enter the Email address :");
		String email = sc.nextLine();
		add(firstName, lastName, address, city, state, zipcode, number, email);
	}
}