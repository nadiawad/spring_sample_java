package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */
public interface CustomerService {
    List<Customer> findAll();
}
