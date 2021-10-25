package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.api.entities.Persona;
import com.example.api.repositories.PersonaRepository;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PersonaServiceTest {
	
	@MockBean
	private PersonaRepository personaRepository;
	
	@Autowired
	private PersonaServiceImpl personaService;
	
	@Test
	public void testSearch() throws Exception{
		
		Persona persona = new Persona ();
		persona.setNombre("Pedro");
		
		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona);
		
		when(personaRepository.searchNative("Pedro")).thenReturn(listaEnviada);
		
		assertEquals(listaEnviada, personaService.searchNative("Pedro"));
	}
	

}
