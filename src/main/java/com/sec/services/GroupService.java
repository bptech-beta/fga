package com.sec.services;

import com.sec.models.Group;

import java.util.List;

public interface GroupService {
  void newGroup(String groupName);
  List<Group> findAll();
  void deleteGroup(Long groupId);
}
