package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/hi")
  public Greeting greeting(@RequestParam(value = "message", defaultValue = "hi") String message) {
    return new Greeting(message);
  }
}