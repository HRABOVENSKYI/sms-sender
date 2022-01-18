package com.example.twiliosms;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    @Qualifier("twilio")
    private final SmsSender smsSender;

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
