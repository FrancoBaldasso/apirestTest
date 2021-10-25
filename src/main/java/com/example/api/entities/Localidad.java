package com.example.api.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Audited
public class Localidad extends Base{
	
	@Column(name = "denominacion")
	@NonNull private String denominacion;

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	
}
