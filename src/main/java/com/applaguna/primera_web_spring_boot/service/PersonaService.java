package com.applaguna.primera_web_spring_boot.service;

import com.applaguna.primera_web_spring_boot.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();
    Persona obtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actulizarPersona(Long id, Persona persona);
    void elimnarPersona(Long id);
}
