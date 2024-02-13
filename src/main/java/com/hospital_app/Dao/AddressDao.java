package com.hospital_app.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.Address;
import com.hospital_app.Helper.AddressHelper;

public class AddressDao {

	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();



	public static Address saveAddress(Address address) {

		entityTransaction.begin();
		enitityManager.persist(address);
		entityTransaction.commit();

		return address;

	}

}
