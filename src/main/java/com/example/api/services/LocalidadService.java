package com.example.api.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.api.entities.Localidad;

public interface LocalidadService extends BaseService<Localidad, Long>{

	Page<Localidad> searchNative(String filtro, Pageable pageable) throws Exception;

}
