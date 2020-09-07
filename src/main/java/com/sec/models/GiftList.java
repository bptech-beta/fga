package com.sec.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GIFTLIST")
public class GiftList {

  @Id
  @GeneratedValue
  private Long id;
  private Long eventId;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Gift> gifts = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public List<Gift> getGifts() {
    return gifts;
  }

  public void setGifts(List<Gift> gifts) {
    this.gifts = gifts;
  }
}
