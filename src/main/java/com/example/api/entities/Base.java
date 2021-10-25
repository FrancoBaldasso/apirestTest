package com.example.api.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Base implements Serializable {

	private static final long serialVersionUID = -4518202619879070107L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Base(Long id) {
		super();
		this.id = id;
	}

	public Base() {
		super();
	}
	
	
}
