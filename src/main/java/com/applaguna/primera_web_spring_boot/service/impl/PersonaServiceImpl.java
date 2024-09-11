package com.applaguna.primera_web_spring_boot.service.impl;

import com.applaguna.primera_web_spring_boot.entities.Persona;
import com.applaguna.primera_web_spring_boot.repository.PersonaRepository;
import com.applaguna.primera_web_spring_boot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actulizarPersona(Long id, Persona persona) {
        Persona personaBBDD = personaRepository.findById(id).orElse(null);
        if (personaBBDD != null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }

        return null;
    }

    @Override
    public void elimnarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
