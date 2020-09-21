package com.sec.controllers;

import com.sec.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

  EventService eventService;

  @Autowired
  public EventController(EventService eventService) {
    this.eventService = eventService;
  }

  @GetMapping("/events")
  public String getEvent(Model model) {
    model.addAttribute("evts", eventService.findAll());
    return "events";
  }

  @RequestMapping(value = "/delete_event", method = RequestMethod.POST)
  public String deleteGroup(@ModelAttribute(name = "eventId") Long eventId){
    eventService.deleteEvent(eventId);
    return "redirect:/events";
  }
}
