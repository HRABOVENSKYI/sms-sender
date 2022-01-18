package com.example.twiliosms;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
@NoArgsConstructor
@Data
public class TwilioConfig {
    private String accountSid;
    private String authToken;
    private String trialNumber;
}
