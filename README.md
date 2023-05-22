# springboot-SMTP-mail-sender
Springboot application to send emails using Gmail SMTP protocol


Springboot version: "3.1.0"  Java version: java version "1.8.0_291" (Java 8)  IDE: IntelliJ IDEA

Dependancies: Java Mail Sender

Sender's gmail account should be 2F verified and app password should be created.

Update the application.properties as mentioned below

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=sender@gmail.com
spring.mail.password=generated_sender_gmail_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true



