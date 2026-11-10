package com.qsp.banking_management_system_E4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.banking_management_system_E4.dao.BranchDao;
import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.repo.BranchRepo;

@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;
	
	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}
	
	public Branch fetchBranchById(int branchId) {
		return branchDao.fetchBranchById(branchId);
	}
	
	
}
