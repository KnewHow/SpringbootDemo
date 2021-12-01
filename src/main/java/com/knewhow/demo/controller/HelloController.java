package com.knewhow.demo.controller;


import com.knewhow.demo.pojo.Customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @RequestMapping("/first_page")
    public Customer hello() {
       var c = new Customer();
       return c;
    }
}
