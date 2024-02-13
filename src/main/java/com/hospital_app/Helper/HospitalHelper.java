package com.hospital_app.Helper;

import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Encounter;
import com.hospital_app.Dto.Hospital;

public class HospitalHelper {

	static Scanner s = new Scanner(System.in);

	// find hospitalBy id

	public static int getHospitalId() {
		System.out.println("Enter hospital Id: ");
		int hospitalId = s.nextInt();
		return hospitalId;
	}

	// save hospital data

	public static Hospital saveData() {

		Hospital hospital = new Hospital();

		System.out.println("Enter Hospital Id: ");
		int hospitalId = s.nextInt();

		System.out.println("Enter Hospital name: ");
		String hospitalName = s.next();

		System.out.println("Enter Hospital phone number: ");
		String hospitalNumber = s.next();

		System.out.println("Enter hospital email: ");
		String hospitalEmail = s.next();

		System.out.println("Enter hospital Type: ");
		String hospitalType = s.next();

		hospital.setHospitaiId(hospitalId);
		hospital.setName(hospitalName);
		hospital.setPhone(hospitalNumber);
		hospital.setEmail(hospitalEmail);
		hospital.setType(hospitalType);
		
//		List<Branch> branches = BranchHelper.saveBranchData();
//		hospital.setBranches(branches);

		return hospital;
	}

}
