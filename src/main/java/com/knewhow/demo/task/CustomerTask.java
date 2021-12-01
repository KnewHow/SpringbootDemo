package com.knewhow.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service 
public class CustomerTask {
    
    @Scheduled(cron = "0/2 * * ? * *")
    public void queryCustomer() {
        System.out.println("execute task: query customer " + System.currentTimeMillis() + " ms");
    }
}
