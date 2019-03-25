package com.xxx.saberj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaberjService {
  @Autowired
  private SaberjProperties saberjProperties;
  public SaberjService(){
    System.out.printf("init---------------------");
  }
  public String getConnection(){
    System.out.printf("getConnection---------------------url="+saberjProperties.getUrl());
    return saberjProperties.getUrl();
  }
}
