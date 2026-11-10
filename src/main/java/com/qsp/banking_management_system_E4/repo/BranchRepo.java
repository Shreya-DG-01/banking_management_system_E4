package com.qsp.banking_management_system_E4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.banking_management_system_E4.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer> {

}
