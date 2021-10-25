package com.example.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.example.api.entities.Persona;
import com.example.api.repositories.BaseRepository;
import com.example.api.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private PersonaRepository personaRepository;
	

	@Override
	public List<Persona> searchNative(String filtro) throws Exception {
			try {
				List<Persona> personas = personaRepository.searchNative(filtro);
			return personas;
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}
	}
}
