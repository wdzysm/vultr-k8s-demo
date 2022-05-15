package com.example.vultrk8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class VultrK8sDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(VultrK8sDemoApplication.class, args);
  }

}
