package com.knewhow.demo.mapper;

import java.util.List;

import com.knewhow.demo.pojo.Customer;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CustomerMapper {
    List<Customer> queryCustomers();
    Customer queryCustomerPhone(String phoneNumber);
    int insertCustomer(Customer customer);
    int deleteById(Long id);
    int deleteByPhoneNumber(String phoneNumber);
}
