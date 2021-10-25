package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.api.entities.Localidad;
import com.example.api.repositories.BaseRepository;
import com.example.api.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long>implements LocalidadService{

	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	@Override
	public Page<Localidad> searchNative(String filtro, Pageable pageable) throws Exception {
		try {
			Page<Localidad> localidades = localidadRepository.searchNative(filtro, pageable);
		return localidades;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
