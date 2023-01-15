package com.zero.cms.client;

import com.zero.cms.client.mailgun.SendMailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandboxb8046a8fb7974f0696268ba1614b99bb.mailgun.org/messages")
    ResponseEntity<String> sendEmail(@SpringQueryMap SendMailForm form);
}
