package com.example.api.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.api.entities.Persona;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public final class PersonaRepositoryTest {

	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Test
	public void testSearch() {
		
		Persona persona = new Persona ();
		persona.setNombre("Pedro");
		
		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona);
		
		entityManager.persist(persona);
		entityManager.flush();
		
		assertEquals(listaEnviada, personaRepository.searchNative("Pedro"));
		
		
	}
	
	
}
