package com.example.twiliosms.config;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);

    public TwilioInitializer(TwilioConfig twilioConfig) {
        Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
        LOGGER.info("Twilio initialized ... with account sid {}", twilioConfig.getAccountSid());
    }
}
