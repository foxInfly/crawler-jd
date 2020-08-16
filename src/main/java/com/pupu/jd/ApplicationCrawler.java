package com.pupu.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author : lipu
 * @since : 2020-08-16 17:59
 */
@SpringBootApplication

@EnableScheduling
public class ApplicationCrawler {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationCrawler.class);
    }
}
