package com.example.api.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.api.entities.Persona;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
	
	@Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
			
			nativeQuery = true
			)
	
	List<Persona> searchNative(@Param("filtro") String filtro);

}