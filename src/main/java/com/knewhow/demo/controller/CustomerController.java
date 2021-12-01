package com.knewhow.demo.controller;

import com.knewhow.demo.controller.requestBean.QueryByPhoneNumberRequest;
import com.knewhow.demo.pojo.Customer;
import com.knewhow.demo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/queryByPhoneNumber")
    public Customer queryByPhoneNumber(@RequestBody QueryByPhoneNumberRequest request){
        return customerService.queryCustomerByPhone(request.getPhoneNumber());
    }

    @PostMapping("/insertCustomer")
    public int insertCustomer(@RequestBody Customer customer) {
        return customerService.insertCustomer(customer);
    }
}
