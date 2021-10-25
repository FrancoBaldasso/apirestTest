package com.example.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.api.entities.Localidad;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long>{

	@Query(value = "SELECT * FROM localidad WHERE localidad.denominacion LIKE %:filtro%",
			countQuery = "SELECT count(*) FROM localidad",
			nativeQuery = true
			)
	Page<Localidad> searchNative(@Param("filtro") String filtro, Pageable pageable);
}
