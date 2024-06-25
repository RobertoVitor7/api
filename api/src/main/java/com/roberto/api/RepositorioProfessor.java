package com.roberto.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProfessor extends JpaRepository <Professor,Long> {
    
}
