package com.zero.cms.client.service;

import com.zero.cms.client.MailgunClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        // need test cod
        mailgunClient.sendEmail(null);
//        String response = emailSendService.sendEmail();
//        System.out.println(response);
    }
}