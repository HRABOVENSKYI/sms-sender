package com.example.twiliosms.controller;

import com.example.twiliosms.service.impl.Service;
import com.example.twiliosms.dto.SmsRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/sms")
@RequiredArgsConstructor
public class
Controller {

    private final Service service;

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        service.sendSms(smsRequest);
    }
}
