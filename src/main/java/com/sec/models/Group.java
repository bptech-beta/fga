package com.sec.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GRP")
public class Group {

  @Id
  @GeneratedValue
  private Long id;
  private String groupName;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Event> eventList = new ArrayList<>();

  public Group(String groupName) {
    this.groupName = groupName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public List<Event> getEventList() {
    return eventList;
  }

  public void setEventList(List<Event> eventList) {
    this.eventList = eventList;
  }
}
