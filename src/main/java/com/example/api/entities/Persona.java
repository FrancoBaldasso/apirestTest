package com.example.api.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.envers.Audited;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
//import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
//import lombok.Setter;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Audited
public class Persona extends Base{


	/**
	 * 
	 */
	private static final long serialVersionUID = -995460573492148852L;

	@Column
	@NonNull private String nombre;
	
	@Column
	@NonNull private String apellido;
	
	@Column
	@NotNull private int dni;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	//Relacion
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="fk_domicilio")
	private Domicilio domicilio;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "persona_libro",
			joinColumns = @JoinColumn(name = "persona_id"),
			inverseJoinColumns = @JoinColumn(name = "libro_id")
	)
	private List<Libro> libros = new ArrayList<Libro>();

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
	
}
