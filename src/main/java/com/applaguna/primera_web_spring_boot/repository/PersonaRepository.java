package com.applaguna.primera_web_spring_boot.repository;

import com.applaguna.primera_web_spring_boot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
