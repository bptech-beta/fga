package com.sec.services;

import com.sec.models.Event;
import com.sec.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
