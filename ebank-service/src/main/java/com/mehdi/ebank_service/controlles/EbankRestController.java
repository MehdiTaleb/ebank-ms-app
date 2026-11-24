package com.mehdi.ebank_service.controlles;

import com.mehdi.ebank_service.entities.BankAccount;
import com.mehdi.ebank_service.services.EbankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EbankRestController {
    private EbankService ebankService;

    public EbankRestController(EbankService ebankService){
        this.ebankService=ebankService;
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllBanlAccount(){
        return ebankService.getAllBanlAccount();
    }

    @GetMapping("/accounts/{id}")
    public BankAccount getBankAccountById(@PathVariable("id") String id){
        return  ebankService.getBankAccountById(id);
    }

    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        return ebankService.save(bankAccount);
    }
}
