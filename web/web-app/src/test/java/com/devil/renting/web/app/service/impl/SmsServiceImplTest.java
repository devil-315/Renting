package com.devil.renting.web.app.service.impl;

import com.devil.renting.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName：SmsServiceImplTest
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
@SpringBootTest
class SmsServiceImplTest {
    @Autowired
    private SmsService service;

    @Test
    void sendCode(){
        service.sendCode("19516512506","1234");
    }
}