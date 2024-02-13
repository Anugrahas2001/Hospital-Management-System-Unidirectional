package com.hospital_app.Helper;

import java.util.Scanner;

import com.hospital_app.Dto.Address;

public class AddressHelper {

	static Scanner s = new Scanner(System.in);

	public static Address saveAddressDetails() {
		Address address = new Address();

		System.out.println("Enter Address Id: ");
		int addressId = s.nextInt();

		System.out.println("Enter Street name: ");
		String streetName = s.next();

		System.out.println("Enter city name: ");
		String cityName = s.next();

		System.out.println("Enter state name: ");
		String stateName = s.next();

		System.out.println("Enter pincode: ");
		String pinCode = s.next();

		address.setAddressId(addressId);
		address.setStreet(streetName);
		address.setCity(cityName);
		address.setState(stateName);
		address.setPin(pinCode);

		return address;

	}

}
