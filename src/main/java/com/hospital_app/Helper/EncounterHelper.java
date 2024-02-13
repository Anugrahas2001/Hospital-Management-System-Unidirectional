package com.hospital_app.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital_app.Dto.Encounter;
import com.hospital_app.Dto.MedOrder;
import com.hospital_app.Dto.Person;

public class EncounterHelper {
static Scanner s=new Scanner(System.in);
	
	
	public static Encounter saveEncounterData()
	{
		Encounter encounter=new Encounter();
		
		System.out.println("enter Encounter Id: ");
		int Encounter=s.nextInt();
		
		System.out.println("Enter the name of the disease: ");
		String disease=s.next();
		
		System.out.println("Enter admission date: ");
		String admitDate=s.next();
		
		System.out.println("enter discharge date: ");
		String dischargeDate=s.next();
		
		System.out.println("Enter docter name: ");
		String docterName=s.next();
		
		encounter.setEncounterId(Encounter);
		encounter.setDisease(disease);
		encounter.setAdmitDate(admitDate);
		encounter.setDischargeDate(dischargeDate);
		encounter.setDocterName(docterName);
		
		List<Encounter> encounters=new ArrayList<Encounter>();
		encounters.add(encounter);
				
//		Person person=PersonHelper.savePersonData();
//		encounter.setPersons(person);
//		
//		MedOrder med=MedOrderHelper.saveMedOrder();
//		List<MedOrder> medorders=new ArrayList<MedOrder>();
//		medorders.add(med);
//		encounter.setMedOrders(medorders);
		
		return encounter;
		
	}
	
	//get Encounter Id
	
	public static int getEncounterById()
	{
		System.out.println("Enter Encounter id: ");
		int encounterId=s.nextInt();
		return encounterId;
	}

}
