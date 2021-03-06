package com.vosipov.npspring5tutorial.controllers;

import com.vosipov.npspring5tutorial.mail.MailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {
    private MailSender mailSender;

    public MailController(MailSender smtpMailSender) {
        this.mailSender = smtpMailSender;
    }

    @GetMapping("/mail")
    public String mail(@RequestParam(value = "myName", defaultValue = "World") String name) throws MessagingException {
        mailSender.send("mail@example.com", "A test mail", "Body of the test mail");

        return "Mail sent";
    }
}
