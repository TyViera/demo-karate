package com.travelport.demokarate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StaticListener {

  private static ApplicationContext applicationContext;

  public static <T> T getBean(Class<T> beanClass) {
    return applicationContext.getBean(beanClass);
  }

  @Autowired
  public void setApplicationContext(ApplicationContext applicationContext) {
    StaticListener.applicationContext = applicationContext;
  }
}
