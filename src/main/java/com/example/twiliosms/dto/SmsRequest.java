package com.example.twiliosms.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SmsRequest {

    @NotBlank
    private final String phoneNumber; // destination

    @NotBlank
    private final String message;
}
