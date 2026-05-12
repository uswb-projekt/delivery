package edu.prz.delivery.restaurants.domain.restaurant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

  @Id
  Long id;

  String name;
}
