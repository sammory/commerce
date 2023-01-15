package com.zero.cms;

import com.zero.cms.client.service.EmailSendService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}

}
