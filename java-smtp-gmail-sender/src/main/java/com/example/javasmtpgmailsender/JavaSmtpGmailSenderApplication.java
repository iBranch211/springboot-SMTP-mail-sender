package com.example.javasmtpgmailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaSmtpGmailSenderApplication {

	@Autowired
	private JavaSmtpGmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(JavaSmtpGmailSenderApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("receiver@gmail.com","This is subject","This is email body");
	}


}
