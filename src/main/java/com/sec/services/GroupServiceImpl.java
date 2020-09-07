package com.sec.services;

import com.sec.models.Group;
import com.sec.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

  GroupRepository groupRepository;

  @Autowired
  public GroupServiceImpl(GroupRepository groupRepository) {
    this.groupRepository = groupRepository;
  }

  @Override
  public void newGroup(String groupName) {
    Group group = new Group(groupName);
      groupRepository.save(group);
  }
}
