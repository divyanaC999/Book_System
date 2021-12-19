package com.addressbookuc2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystemUC2 {
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Address details :");
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String address = sc.nextLine();
		String city = sc.nextLine();
		String state = sc.nextLine();
		String zipcode = sc.nextLine();
		String number = sc.nextLine();
		String email = sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		list.add(firstName);
		list.add(lastName);
		list.add(address);
		list.add(city);
		list.add(state);
		list.add(zipcode);
		list.add(number);
		list.add(email);

		Object[] abjArr = list.toArray();
		for(Object obj: abjArr) {
			System.out.print((String)obj);
			System.out.println("\nContact1 Added.......\n");
		}
	}
}
