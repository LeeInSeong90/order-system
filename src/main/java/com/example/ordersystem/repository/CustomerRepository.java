package com.example.ordersystem.repository;


import com.example.ordersystem.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {



}