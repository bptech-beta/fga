package com.sec.services;

import com.sec.models.Event;

import java.sql.Date;
import java.util.List;

public interface EventService {
  List<Event> findAll();
  void deleteEvent(Long eventId);
  void newEvent(int userId, String eventName, Date date, String description, String location, boolean isItForEveryone);
}
