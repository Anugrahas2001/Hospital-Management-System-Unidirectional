package com.hospital_app.Dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hospital_app.Dto.Address;
import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Encounter;
import com.hospital_app.Dto.Person;
import com.hospital_app.Helper.AddressHelper;
import com.hospital_app.Helper.BranchHelper;
import com.hospital_app.Helper.EncounterHelper;
import com.hospital_app.Helper.PersonHelper;

public class EncounterDao {

	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();

	// save encounter

	public static void saveEncounter(int branchId,int personId) {
		
		Branch branch = enitityManager.find(Branch.class, branchId);
	
		Person person = enitityManager.find(Person.class, personId);

		if (branch != null) {
			if (person != null) {
				Encounter encounter1 = EncounterHelper.saveEncounterData();
				List<Encounter> encounters = branch.getEncounters();
				encounters.add(encounter1);
				branch.setEncounters(encounters);
				encounter1.setPersons(person);

				entityTransaction.begin();
				enitityManager.persist(encounter1);
				entityTransaction.commit();

				entityTransaction.begin();
				enitityManager.merge(branch);
				entityTransaction.commit();
			}
			else {
				System.out.println("This person is not exit.So please enter a new person details.");
				Person personDetails=PersonHelper.savePersonData();
				Person newPerson=PersonDao.savePersondata(personDetails);
				
				Encounter encounter1 = EncounterHelper.saveEncounterData();
				List<Encounter> encounters = branch.getEncounters();
				encounters.add(encounter1);
				branch.setEncounters(encounters);
				encounter1.setPersons(newPerson);
				
				entityTransaction.begin();
				enitityManager.persist(encounter1);
				entityTransaction.commit();
				
				entityTransaction.begin();
				enitityManager.merge(branch);
				entityTransaction.commit();
			}
			

		} else {
			System.out.println("Branch and person is not found");
		}

	}

}
