package com.example.api.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.api.entities.Autor;
import com.example.api.repositories.AutorRepository;
import com.example.api.repositories.BaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

	public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private AutorRepository autorRepository;

	@Override
	public Page<Autor> searchNative(String filtro, Pageable pageable) throws Exception {
		try {
			Page<Autor> autores = autorRepository.searchNative(filtro, pageable);
		return autores;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

}
