package com.sec.controllers;

import com.sec.services.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GroupController {

  GroupService groupService;

  public GroupController(GroupService groupService) {
    this.groupService = groupService;
  }

  @RequestMapping(value = "/create_group", method = RequestMethod.POST)
  public String createGroup(@ModelAttribute(name = "gn") String groupName){
    groupService.newGroup(groupName);
    return "redirect:/";
  }

  @RequestMapping(value = "/delete_group", method = RequestMethod.POST)
  public String deleteGroup(@ModelAttribute(name = "groupId") Long groupId){
    groupService.deleteGroup(groupId);
    return "redirect:/";
  }
}
