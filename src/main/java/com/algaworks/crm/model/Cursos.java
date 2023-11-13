package com.algaworks.crm.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cursos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String curso;
	
		@Column (nullable = false)
	private Long nota;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public Long getNota() {
			return nota;
		}

		public void setNota(Long nota) {
			this.nota = nota;
		}

		@Override
		public int hashCode() {
			return Objects.hash(curso, id, nota);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cursos other = (Cursos) obj;
			return Objects.equals(curso, other.curso) && Objects.equals(id, other.id)
					&& Objects.equals(nota, other.nota);
		}

		
	
	
	
}
