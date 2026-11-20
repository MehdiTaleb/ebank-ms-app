package com.mehdi.customerservice.service;

import com.mehdi.customerservice.entities.Customer;
import com.mehdi.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public  CustomerService(CustomerRepository customerRepository) {
        this.customerRepository= customerRepository;
    }
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    public Customer findCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(" Customer Not Found"));
    }

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
