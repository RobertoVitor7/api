package com.roberto.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="professor")
public class Professor {
    @Id
    @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
   public String nome;
   public Long id;
    
}
