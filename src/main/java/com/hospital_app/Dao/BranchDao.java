package com.hospital_app.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital_app.Dto.Branch;
import com.hospital_app.Dto.Hospital;
import com.hospital_app.Helper.BranchHelper;
import com.hospital_app.Helper.HospitalHelper;

public class BranchDao {

	static EntityManagerFactory enityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager enitityManager = enityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = enitityManager.getTransaction();

	// is hospital is present method

	public static Branch saveHospitalBranch(Branch branch) {

		entityTransaction.begin();
		enitityManager.persist(branch);
		entityTransaction.commit();
		System.out.println("Branch added successfully.....");
		return branch;

	}

	public static List<Branch> saveListOfBranch(Branch branch) {
		List<Branch> branchList = new ArrayList<Branch>();
		branchList.add(branch);
		return branchList;

	}

	public static void hospitalIsAvailable(int hospitalId) {
		Hospital hospital = enitityManager.find(Hospital.class, hospitalId);

		if (hospital != null) {
			Branch branch = BranchHelper.saveBranchData();
			saveHospitalBranch(branch);
			HospitalDao.updateHospitalBranch(hospitalId, branch);

			saveHospitalBranch(branch);
		} else {
			Hospital hospitals = HospitalHelper.saveData();
			HospitalDao.saveHospital(hospitals);

		}
	}

}
