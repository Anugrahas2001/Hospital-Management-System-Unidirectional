package com.hospital_app.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dao.AddressDao;
import com.hospital_app.Dto.Address;
import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Encounter;

public class BranchHelper {
	static Scanner s = new Scanner(System.in);

	public static Branch saveBranchData() {

		Branch branch = new Branch();

		System.out.println("Enter branchId:  ");
		int branchId = s.nextInt();

		System.out.println("Enter branch name: ");
		String branchName = s.next();

		System.out.println("Enter no.Of Docters: ");
		int noOfDoctes = s.nextInt();

		System.out.println("Enter no.Of Beds:  ");
		int noOfBeds = s.nextInt();

		branch.setBranchId(branchId);
		branch.setName(branchName);
		branch.setNoOfBeds(noOfBeds);
		branch.setNoOfDocters(noOfDoctes);
		
		
		Address address = AddressHelper.saveAddressDetails();
		Address add = AddressDao.saveAddress(address);
		branch.setAddress(add);
//
//		List<Encounter> encount = EncounterHelper.saveEncounterData();
//		branch.setEncounters(encount);
//
//		List<Branch> branches = new ArrayList<Branch>();
//		branches.add(branch);

		return branch;

	}
	
	public static int getBranchId() {
	
		System.out.println("enter Branch Id: ");
		int branchId=s.nextInt();
		return branchId;
	}
	
	public static List<Branch> saveListBranch()
	{
		Branch branch=new Branch();
		Address add = AddressHelper.saveAddressDetails();
		branch.setAddress(add);
//
//		List<Encounter> encount = EncounterHelper.saveEncounterData();
//		branch.setEncounters(encount);
//
		List<Branch> branches = new ArrayList<Branch>();
		branches.add(branch);
		return branches;
	}

}
