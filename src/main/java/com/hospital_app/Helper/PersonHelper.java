package com.hospital_app.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dto.Person;

public class PersonHelper {

	static Scanner s = new Scanner(System.in);

	public static Person savePersonData() {
		Person person = new Person();
		System.out.println("enter person Id: ");
		int personId = s.nextInt();

		System.out.println("Enter person name: ");
		String name = s.next();

		System.out.println("Enter person age: ");
		int age = s.nextInt();

		System.out.println("Enter person gender: ");
		String gender = s.next();

		System.out.println("Enter person phone number: ");
		String phone = s.next();

		System.out.println("Enter person's place: ");
		String place = s.next();

		person.setPersonId(personId);
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setPhone(phone);
		person.setPlace(place);

		return person;
		
		

	}

	public static int getPersonId()
	{
		System.out.println("enter person Id: ");
		int personId=s.nextInt();
		return personId;
	}
}
