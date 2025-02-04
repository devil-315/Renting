package com.devil.renting.web.app.service;

public interface SmsService {
    void sendCode(String phone, String code);

}
