package com.example.demo.controller;

import com.example.demo.payload.SmsRequest;
import com.example.demo.services.TwilioSMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    private TwilioSMSService twilioSMSService;

    @PostMapping("/send-sms")
    public void sendSMS(@RequestBody SmsRequest smsRequest) {
        twilioSMSService.sendSMS(smsRequest.getTo(),smsRequest.getMessage(),smsRequest.getFrom());
    }
}
