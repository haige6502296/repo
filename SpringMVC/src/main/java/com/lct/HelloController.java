package com.lct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {
@RequestMapping("/")
  public String display(){
  return "index";
}
}
