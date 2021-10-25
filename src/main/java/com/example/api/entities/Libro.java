package com.example.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Audited
public class Libro extends Base{

	@Column(name = "titulo")
	@NonNull private String titulo;
	
	@Column(name = "fecha")
	@NonNull private int fecha;
	
	@Column(name = "genero")
	@NonNull private String genero;
	
	@Column(name = "paginas")
	@NonNull private int paginas;
	
	@Column(name = "autor")
	@NonNull private String autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	private List<Autor> autores;

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
}
