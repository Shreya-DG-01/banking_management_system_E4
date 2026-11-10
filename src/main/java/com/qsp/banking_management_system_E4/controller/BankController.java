package com.qsp.banking_management_system_E4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.banking_management_system_E4.dto.Bank;
import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.service.BankService;

@RestController
public class BankController {

	@Autowired
	BankService bankService;

	@PostMapping("/saveBank")
	public Bank saveBank(@RequestBody Bank bank) {
		return bankService.saveBank(bank);
	}

	@PutMapping("/addExistingBranchToExistingBank")
	public Bank addExistingBranchToExistingBank(@RequestParam int branchId, @RequestParam int bankId) {
		return bankService.addExistingBranchToExistingBank(branchId, bankId);
	}

	@PutMapping("/addNewBranchToExistingBank")
	public Bank addNewBranchToExistingBank(@RequestParam int bankId,@RequestBody Branch newBranch) {
		return bankService.addNewBranchToExistingBank(bankId, newBranch);
	}

	@PutMapping("/updateBankById")
	public Bank updateBankById(@RequestParam int oldBankId, @RequestBody Bank newBank) {
		return bankService.updateBankById(oldBankId, newBank);
	}

	@GetMapping("/fetchBankById")
	public Bank fetchBankById(@RequestParam int bankId) {
		return bankService.fetchBankById(bankId);
	}

	@DeleteMapping("/deleteBankById")
	public Bank deleteBankById(@RequestParam int bankId) {

		return bankService.deleteBankById(bankId);
	}

	@GetMapping("/fetchAllBank")
	public List<Bank> fetchAllBank() {
		return bankService.fetchAllBank();
	}

}
