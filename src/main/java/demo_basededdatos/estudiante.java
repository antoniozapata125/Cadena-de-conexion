package demo_basededdatos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
		private Integer id_estudiante;
		private String nombre;
		private String email;
		
		public Integer getId_estudiante() {
			return id_estudiante;
		}
		public void setId_estudiante(Integer id_estudiante) {
			this.id_estudiante = id_estudiante;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "estudiante [id_estudiante=" + id_estudiante + ", nombre=" + nombre + ", email=" + email + "]";
		}
		
		
		
}
