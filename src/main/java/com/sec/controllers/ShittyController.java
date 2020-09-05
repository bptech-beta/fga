package com.sec.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShittyController {


  @GetMapping("/anna")
  public String index(){
    return "login";
  }

}
