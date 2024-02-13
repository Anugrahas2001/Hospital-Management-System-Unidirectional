package com.hospital_app.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dto.Item;

public class ItemHelper {

	static Scanner s = new Scanner(System.in);

	public static List<Item> saveItems() {
		Item item = new Item();

		System.out.println("Enter item Id: ");
		int itemId = s.nextInt();

		System.out.println("Enter medicine Name: ");
		String medName = s.next();

		System.out.println("Enter Medicine Type: ");
		String medType = s.next();

		System.out.println("Enter medicine price: ");
		int price = s.nextInt();

		System.out.println("Enter medicine description: ");
		String description = s.next();

		item.setItemId(itemId);
		item.setMedName(medName);
		item.setMedType(medType);
		item.setPrice(price);
		item.setDescription(description);

		List<Item> items = new ArrayList<Item>();
		items.add(item);

		return items;
	}

}
