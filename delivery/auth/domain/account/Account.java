package edu.prz.delivery.auth.domain.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

  @Id
  Long id;

  String email;
}
