package com.example.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.api.entities.Autor;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long>{

	@Query(value = "SELECT * FROM autor WHERE autor.nombre LIKE %:filtro% OR autor.apellido LIKE %:filtro%",
			countQuery = "SELECT count(*) FROM autor",
			nativeQuery = true
			)
	Page<Autor> searchNative(@Param("filtro") String filtro, Pageable pageable);
}
