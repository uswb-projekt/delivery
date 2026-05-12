package edu.prz.delivery.deliveries.domain.delivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Delivery {

  @Id
  Long id;

  String status;
}
