package com.example.api.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.api.entities.Persona;

public interface PersonaService extends BaseService<Persona, Long>{

	List<Persona> searchNative(String filtro) throws Exception;
}
