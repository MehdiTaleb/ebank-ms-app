package com.mehdi.ebank_service.repository;

import com.mehdi.ebank_service.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository <BankAccount , String>{

    List<BankAccount> findBuCustomerId(Long id);

}
