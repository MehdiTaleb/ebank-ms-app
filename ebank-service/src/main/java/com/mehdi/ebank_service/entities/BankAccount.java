package com.mehdi.ebank_service.entities;

import com.mehdi.ebank_service.model.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.Date;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {
    @Id
    private long id ;
    private Date createdAt;
    private double balance;
    private  String type;
    private long customerId;
    @Transient
    private Customer customer;

}
