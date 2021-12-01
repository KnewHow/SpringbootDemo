package com.knewhow.demo.service;

import java.util.List;

import com.knewhow.demo.mapper.CustomerMapper;
import com.knewhow.demo.pojo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;

    public List<Customer> queryCustomers() {
        return mapper.queryCustomers();
    }

    public Customer queryCustomerByPhone(String phoneNumber) {
        return mapper.queryCustomerPhone(phoneNumber);
    }

    //@Transactional
    public int insertCustomer(Customer customer) {
        int r =  mapper.insertCustomer(customer);
        //int a = 1/0;
        return r;
    }

    public int deleteByPhoneNumber(String phoneNumber) {
        return deleteByPhoneNumber(phoneNumber);
    }

    public int deleteById(Long id) {
        return deleteById(id);
    }
}
