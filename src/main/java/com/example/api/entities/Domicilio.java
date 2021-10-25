package com.example.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Audited

public class Domicilio extends Base{

	@Column(name = "calle")
	@NonNull private String calle;
	
	@Column(name = "numero")
	@NonNull private int numero;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@ManyToOne(optional = false) 
	@JoinColumn(name = "fk_localidad")
	private Localidad localidad;

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
}
