package com.knewhow.demo;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.knewhow.demo.pojo.Customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	void contextLoads() throws SQLException {
		System.out.println("datesource--> " + dataSource.getClass());
		Connection conn = dataSource.getConnection();
		System.out.println("connection -->" + conn);
	}

	@Test
	void redisOpTest() {
		Customer customer = new Customer(1L, "18326600931", "Knewhow", "123456", 0, 18, 1);
		redisTemplate.opsForValue().set(customer.getId().toString(), customer);
		var c = redisTemplate.opsForValue().get("1");
		System.out.println("customer--->: " + c);
	}

}
