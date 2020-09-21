package com.sec.repositories;

import com.sec.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository <Event, Long> {
  List<Event> findAll();
  void deleteById(Long eventId);
}
