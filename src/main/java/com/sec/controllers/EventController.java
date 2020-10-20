package com.sec.controllers;

import com.sec.models.User;
import com.sec.repositories.UserRepository;
import com.sec.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Controller
public class EventController {

  EventService eventService;
  UserRepository userRepository;


  public EventController(EventService eventService, UserRepository userRepository) {
    this.eventService = eventService;
    this.userRepository = userRepository;
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

  @RequestMapping(value = "/create_event", method = RequestMethod.POST)
  public String createGroup(@ModelAttribute(name = "eventName") String eventName,
                            @ModelAttribute(name = "date") String date,
                            @ModelAttribute(name = "description") String description,
                            @ModelAttribute(name = "location") String location,
                            @ModelAttribute(name = "isItForEveryone") String isItForEveryone){
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String currentPrincipalName = authentication.getName();
    Optional<User> user = userRepository.findByUserName(currentPrincipalName);
    Date d = new Date(System.currentTimeMillis());
    eventService.newEvent(user.get().getId(), eventName, d, description, location, false);
    return "redirect:/events";
  }
}
