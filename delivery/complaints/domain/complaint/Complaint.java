package edu.prz.delivery.complaints.domain.complaint;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Complaint {

  @Id
  Long id;

  String reason;
}
