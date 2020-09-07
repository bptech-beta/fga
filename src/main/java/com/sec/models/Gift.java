package com.sec.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import javax.persistence.*;

@Entity
@Table(name = "GIFT")
public class Gift {

  @Id
  @GeneratedValue
  Long id;
  Long giftListId;
  String link;
  String description;
  Long price;
  Long peaces;
  boolean isTaken;

  public Gift() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getGiftListId() {
    return giftListId;
  }

  public void setGiftListId(Long giftListId) {
    this.giftListId = giftListId;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Long getPeaces() {
    return peaces;
  }

  public void setPeaces(Long peaces) {
    this.peaces = peaces;
  }

  public boolean isTaken() {
    return isTaken;
  }

  public void setTaken(boolean taken) {
    isTaken = taken;
  }
}
