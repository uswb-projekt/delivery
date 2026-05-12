package edu.prz.delivery.marketing.domain.promotion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Promotion {

  @Id
  Long id;

  String promoCode;
}
