package com.sec.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EVENT")
public class Event {

  @Id
  @GeneratedValue
  private Long id;
  private Long ownerUserId;
  private String eventName;
  private Date date;
  private String description;
  private String location;
  private boolean isItForEveryone;
  @OneToMany(cascade = CascadeType.ALL)
  private List<GiftList> giftList = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(Long ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public boolean isItForEveryone() {
    return isItForEveryone;
  }

  public void setItForEveryone(boolean itForEveryone) {
    isItForEveryone = itForEveryone;
  }

  public List<GiftList> getGiftList() {
    return giftList;
  }

  public void setGiftList(List<GiftList> giftList) {
    this.giftList = giftList;
  }
}
