package com.example.api.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.api.entities.Autor;

public interface AutorService extends BaseService<Autor, Long>{

	Page<Autor> searchNative(String filtro, Pageable pageable) throws Exception;
}
