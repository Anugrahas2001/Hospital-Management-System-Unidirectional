package com.hospital_app.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Hospital;
import com.hospital_app.Helper.HospitalHelper;

public class HospitalDao {
	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();
static Hospital hospital =new Hospital();
	public static Hospital saveHospital(Hospital hospital) {	
	
		
		entityTransaction.begin();
		enitityManager.persist(hospital);
		entityTransaction.commit();
		System.out.println("Hospital added succesfullyyy............");
		return hospital;

	}
public static Hospital updateHospitalBranch(int id,Branch branch)

{
	Hospital newHospital=enitityManager.find(Hospital.class, id);
	List<Branch> branches=BranchDao.saveListOfBranch(branch);
	hospital.setBranches(branches);
	
	entityTransaction.begin();
	enitityManager.merge(hospital);
	entityTransaction.commit();
	
	return hospital;
	
}
}
