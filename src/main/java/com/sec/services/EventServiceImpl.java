package com.sec.services;

import com.sec.models.Event;
import com.sec.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{

  EventRepository eventRepository;

  @Autowired
  public EventServiceImpl(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  @Override
  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  @Override
  public void deleteEvent(Long eventId) {
    eventRepository.deleteById(eventId);
  }

  @Override
  public void newEvent(int userId, String eventName, Date date, String description, String location, boolean isItForEveryone) {
    Event event = new Event();
    event.setOwnerUserId((long) userId);
    event.setEventName(eventName);
    event.setDate(date);
    event.setDescription(description);
    event.setLocation(location);
    event.setItForEveryone(isItForEveryone);
    eventRepository.save(event);
  }
}
