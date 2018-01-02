package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nadi on 20/12/2017.
 */

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl(){

    }
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("In the constructor....");
        this.customerRepository = customerRepository;
    }
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("In the setter....");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
