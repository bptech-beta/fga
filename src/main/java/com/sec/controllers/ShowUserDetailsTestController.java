//package com.sec.controllers;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ShowUserDetailsTestController {
//
//  @GetMapping("/user")
//  public String user(){
//    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//    String currentPrincipalName = authentication.getName();
//    return ("<h1>HELLO USER<h1>" + currentPrincipalName);
//  }
//}
