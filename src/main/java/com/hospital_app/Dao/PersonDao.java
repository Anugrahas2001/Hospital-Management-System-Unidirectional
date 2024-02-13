package com.hospital_app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.MedOrder;
import com.hospital_app.Dto.Person;
import com.hospital_app.Helper.MedOrderHelper;
import com.hospital_app.Helper.PersonHelper;

public class PersonDao {
	
	
	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();
	
	Person person=PersonHelper.savePersonData();
	
	public static Person savePersondata(Person person)
	
	{
		
		entityTransaction.begin();
		enitityManager.persist(person);
		entityTransaction.commit();
		return person;
		
	}

}
