package com.devil.renting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * ClassName：AppWebApplication
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
@SpringBootApplication
@EnableAsync
public class AppWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWebApplication.class);
    }
}
