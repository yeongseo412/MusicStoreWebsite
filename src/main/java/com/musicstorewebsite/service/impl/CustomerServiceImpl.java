package com.musicstorewebsite.service.impl;

import com.musicstorewebsite.dao.CustomerDao;
import com.musicstorewebsite.model.Customer;
import com.musicstorewebsite.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Le on 1/23/2016.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer (Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById (int customerId) {
        return customerDao.getCustomerById(customerId);
    }

}
