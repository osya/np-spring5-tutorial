package com.vosipov.npspring5tutorial.controllers;

import com.vosipov.npspring5tutorial.mail.MailSender;
import com.vosipov.npspring5tutorial.mail.MockMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender = new MockMailSender();

    @GetMapping("/mail")
    public String mail(@RequestParam(value = "myName", defaultValue = "World") String name) {
        mailSender.send("mail@example.com", "A test mail", "Body of the test mail");

        return "Mail sent";
    }
}