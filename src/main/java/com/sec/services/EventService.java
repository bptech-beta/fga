package com.sec.services;

import com.sec.models.Event;

import java.util.List;

public interface EventService {
  List<Event> findAll();
  void deleteEvent(Long eventId);
}
