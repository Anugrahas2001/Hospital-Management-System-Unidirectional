package com.hospital_app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.Encounter;
import com.hospital_app.Dto.MedOrder;
import com.hospital_app.Helper.EncounterHelper;
import com.hospital_app.Helper.MedOrderHelper;

public class MedOrderDao {

	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();

	public static MedOrder saveMedOrder(int medorderId) {
		
		Encounter encounter=enitityManager.find(Encounter.class, medorderId);
		
		if(encounter!=null)
		{
			MedOrder medOrders=MedOrderHelper.saveMedOrder();
			List<MedOrder> listMedOrder=encounter.getMedOrders();
			listMedOrder.add(medOrders);
			encounter.setMedOrders(listMedOrder);
			
			entityTransaction.begin();
			enitityManager.persist(medOrders);
			entityTransaction.commit();
			System.out.println("MedOrders saved successfully....");
		}else
		{
			System.out.println("encounter is not found");
		}
		
		
		
		
		
		
		
		
		return null;
	
		


	}

}
