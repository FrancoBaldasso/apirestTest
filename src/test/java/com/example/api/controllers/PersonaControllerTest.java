package com.example.api.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.api.entities.Persona;
import com.example.api.services.PersonaServiceImpl;

@WebMvcTest(PersonaController.class)
public class PersonaControllerTest {
	
	@MockBean PersonaServiceImpl personaService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testSearch() throws Exception {
		Persona persona = new Persona ();
		persona.setNombre("Pedro");
		
		List<Persona> listaEnviada = new ArrayList();
		listaEnviada.add(persona);
		
		when(personaService.searchNative("Pedro")).thenReturn(listaEnviada);

		mockMvc.perform(get("/api/v1/personas/searchNative")
				.param("filtro", "Pedro")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].nombre", is("Pedro")));
		
	}
}
