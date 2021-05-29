package com.srm.srminventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SRMInventoryApplication {

    @GetMapping
    public String applicationStatus() {
        return "Application is up and running !";
    }

    @GetMapping("/")
    public String welcome() {
        return "Hi! Welcome to SRM Inventory";
    }

    public static void main(String[] args) {
        SpringApplication.run(SRMInventoryApplication.class, args);
    }

}
