package com.example.travisjavaexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

  @GetMapping
  public String get() {
    return "Hello @ " + System.currentTimeMillis();
  }


}
