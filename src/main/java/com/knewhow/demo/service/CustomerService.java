package com.knewhow.demo.service;
import com.knewhow.demo.pojo.Customer;
import java.util.List;

public interface CustomerService {
    public List<Customer> queryCustomers();

    public Customer queryCustomerByPhone(String phoneNumber);

    public int insertCustomer(Customer customer);

    public int deleteByPhoneNumber(String phoneNumber);

    public int deleteById(Long id);
}
