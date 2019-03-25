package com.xxx.saberj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SaberjService.class)
@EnableConfigurationProperties(SaberjProperties.class)
public class SaberjAutoConfiguration {
  @Autowired
  private SaberjProperties saberjProperties;

}
