package com.example.notificationservicemock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class NotificationservicemockApplication implements CommandLineRunner {
    @Value("${spring.datasource.url}")
    public String dbUrl;
    public static void main(String[] args) {
        SpringApplication.run(NotificationservicemockApplication.class, args);
    }

    @Override
    public void run(String... args) {
      log.info("dbUrl is "+ dbUrl);
// should not have changed anything!!!

    }
}
