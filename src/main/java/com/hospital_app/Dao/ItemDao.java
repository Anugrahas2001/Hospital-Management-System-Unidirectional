package com.hospital_app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.Item;
import com.hospital_app.Helper.ItemHelper;

public class ItemDao {

	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();

	List<Item> items = ItemHelper.saveItems();

	public static Item saveItemData(List<Item> items) {
		entityTransaction.begin();
		enitityManager.persist(items);
		entityTransaction.commit();
		return null;

	}

}
