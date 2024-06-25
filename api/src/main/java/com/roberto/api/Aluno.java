package com.roberto.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Aluno")

public class Aluno {
    @Id 
   
 public   String nome;

 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column (name = "id")
  public  Long id;

public Object sobrenome;

public Object cpf;

public Object nota;

    
}
