package com.xxx.saberj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.xxx.saberj.SaberjService;

@SpringBootApplication
public class SaberjController {
  @Autowired
  SaberjService saberjService;

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication
        .run(SaberjController.class, args);
   System.out.printf("saber="+context.getBean(SaberjService.class).getConnection());
  }
}
