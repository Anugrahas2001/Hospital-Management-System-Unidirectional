package com.hospital_app.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dto.Item;
import com.hospital_app.Dto.MedOrder;
import com.hospital_app.Dto.Person;

public class MedOrderHelper {

	static Scanner s = new Scanner(System.in);

	public static MedOrder saveMedOrder() {
		MedOrder medorder = new MedOrder();

		System.out.println("Enter MedOrder Id: ");
		int medId = s.nextInt();

		System.out.println("Enter dosage: ");
		String dosage = s.next();

		System.out.println("Enter quantity: ");
		String quantity = s.next();

		System.out.println("Enter Order date: ");
		String orderDate = s.next();

		System.out.println("Enter payment mode: ");
		String paymentMode = s.next();

		medorder.setMedId(medId);
		medorder.setDosage(dosage);
		medorder.setQuantity(quantity);
		medorder.setPaymentMode(paymentMode);

		List<MedOrder> medorders = new ArrayList<MedOrder>();
		medorders.add(medorder);

		List<Item> item = ItemHelper.saveItems();
		medorder.setItems(item);

		return medorder;

	}

}
