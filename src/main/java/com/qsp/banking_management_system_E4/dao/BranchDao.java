package com.qsp.banking_management_system_E4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.repo.BranchRepo;

@Repository
public class BranchDao {

	@Autowired
	BranchRepo branchRepo;
	
	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}
	
	public Branch fetchBranchById(int branchId) {
		return branchRepo.findById(branchId).get();
	}
	
	
	
}
