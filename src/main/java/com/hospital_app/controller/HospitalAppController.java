package com.hospital_app.controller;

import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dao.BranchDao;
import com.hospital_app.Dao.EncounterDao;
import com.hospital_app.Dao.MedOrderDao;
import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Encounter;
import com.hospital_app.Dto.MedOrder;
import com.hospital_app.Helper.BranchHelper;
import com.hospital_app.Helper.EncounterHelper;
import com.hospital_app.Helper.HospitalHelper;
import com.hospital_app.Helper.MedOrderHelper;
import com.hospital_app.Helper.PersonHelper;

public class HospitalAppController {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("1.Save Branch data.\n2.save Encounter data.\n3.save Medorder data.");
		System.out.println("Enter your choice: ");
		int choice = s.nextInt();

		switch (choice) {
		case 1: {
			int hospitalId = HospitalHelper.getHospitalId();
			BranchDao.hospitalIsAvailable(hospitalId);
		}
		break;
		
		case 2:
		{
			int branchId=BranchHelper.getBranchId();
			int PersonId=PersonHelper.getPersonId();
			EncounterDao.saveEncounter(branchId,PersonId);
		}
		break;
		case 3:
		{
			int encounterId=EncounterHelper.getEncounterById();
			MedOrderDao.saveMedOrder(encounterId);
			
		}
		break;
		default:
			System.out.println("Enter valid data");

		}
	}

}
