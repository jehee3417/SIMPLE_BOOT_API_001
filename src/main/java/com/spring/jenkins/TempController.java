package com.spring.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TempController {
  @GetMapping
  @ResponseBody
  public String temp() {
    return "hello!";
  }
}
