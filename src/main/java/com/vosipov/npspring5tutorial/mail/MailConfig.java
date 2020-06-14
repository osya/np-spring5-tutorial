package com.vosipov.npspring5tutorial.mail;

import org.springframework.context.annotation.Bean;

@Configuration
public class MailConfig {
    @Bean
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    @Bean
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
}
