package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
