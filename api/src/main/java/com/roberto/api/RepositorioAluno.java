package com.roberto.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAluno extends JpaRepository <Aluno,Long> {
    
}
