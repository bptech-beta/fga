package com.sec.security;

import com.sec.models.MyUserDetails;
import com.sec.models.User;
import com.sec.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {


  UserRepository userRepository;

  @Autowired
  public MyUserDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    Optional<User> user = userRepository.findByUserName(userName);
    user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
    return user.map(MyUserDetails::new).get();
  }
}
