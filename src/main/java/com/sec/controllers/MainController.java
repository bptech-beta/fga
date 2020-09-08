package com.sec.controllers;

import com.sec.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  GroupService groupService;

  @Autowired
  public MainController(GroupService groupService) {
    this.groupService = groupService;
  }

  @GetMapping("/")
  public String home(Model model){
    model.addAttribute("groups", groupService.findAll());
    return ("mainPage");
  }
}
