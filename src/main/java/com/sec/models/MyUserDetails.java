package com.sec.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class MyUserDetails implements UserDetails {

  private String userName;

  private String password;
  private boolean active;
  private List<GrantedAuthority> authorities;

  public MyUserDetails(User user) {
    this.userName = user.getUserName();
    this.password = user.getPassword();
    this.active = user.isActive();
    this.authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//    this.authorities = Arrays.stream(user.getRoles().split(","))
//            .map(SimpleGrantedAuthority::new)
//            .collect(Collectors.toList());
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    List<GrantedAuthority> ga = new ArrayList<>();
    ga.add(new SimpleGrantedAuthority("ROLE_USER"));
    authorities = ga;
    return ga;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return userName;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return active;
  }
}

