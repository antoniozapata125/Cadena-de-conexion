package Agregar_Mas_Datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;

@SpringBootApplication
public class Llena_mas_datos_en_tablas implements CommandLineRunner{

	@Autowired
	private Llena_mas_datos_en_tablas  jdbcLlena_datos_en_tablas;
	
	public static void main(String[] args) {
		SpringApplication.run(Llena_mas_datos_en_tablas.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO estudiante (id_estudiante, nombre, email) VALUES (" 
					+ "'4','Pedro','pedro04@gmail.com') ";
		
		int rows = jdbcLlena_datos_en_tablas.update(sql); 
		if (rows > 0) {
			
			System.out.println("A  new row has been inserted ");
		}
		
	}

	private int update(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}
}
