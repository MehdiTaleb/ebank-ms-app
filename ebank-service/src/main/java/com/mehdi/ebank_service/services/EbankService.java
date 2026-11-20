package com.mehdi.ebank_service.services;

import com.mehdi.ebank_service.entities.BankAccount;
import com.mehdi.ebank_service.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbankService {
    private BankAccountRepository accountRepository;

    public EbankService(BankAccountRepository accountRepository){
        this.accountRepository = accountRepository ;
    }

    public List<BankAccount> getAllBanlAccount(){
        return accountRepository.findAll();
    }

    public BankAccount getBankAccountById(String id){
        return  accountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account Not Found"));
    }

    public BankAccount save(BankAccount bankAccount){
        return accountRepository.save(bankAccount);
    }

}
