package com.applaguna.primera_web_spring_boot;

import com.applaguna.primera_web_spring_boot.entities.Persona;
import com.applaguna.primera_web_spring_boot.repository.PersonaRepository;
import com.applaguna.primera_web_spring_boot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringBootApplication implements CommandLineRunner {

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {

		SpringApplication.run(PrimeraWebSpringBootApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		/*personaRepository.save(new Persona(1l, "Lenin", 17));
		personaRepository.save(new Persona(2l, "PAty", 17));
		personaRepository.save(new Persona(3l, "ramon", 17));
		personaRepository.save(new Persona(4l, "diego", 17));*/

		System.out.println("Numero de Personas de la Tabla: " + personaRepository.count());

		List<Persona> personas = personaRepository.findAll();

		personas.forEach(p -> System.out.println("Nombre de la persona: " + p.getNombre()));

	}
}
