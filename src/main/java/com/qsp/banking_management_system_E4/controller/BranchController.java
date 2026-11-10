package com.qsp.banking_management_system_E4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	BranchService branchService;

	@PostMapping("/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}

	@GetMapping("/fetchBranchById")
	public Branch fetchBranchById(@RequestParam int branchId) {
		return branchService.fetchBranchById(branchId);
	}

}
