package com.example.twiliosms.service;

import com.example.twiliosms.dto.SmsRequest;

public interface SmsSender {
    void sendSms(SmsRequest smsRequest);
}
