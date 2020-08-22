package com.sec;

import com.sec.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecApplication {

  public static void main(String[] args) {
    SpringApplication.run(SecApplication.class, args);
  }

}
