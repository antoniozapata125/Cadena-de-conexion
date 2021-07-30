package demo_basededdatos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Postregsql implements CommandLineRunner {

	@Autowired
	private estudiante_repositorio estudianteRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Postregsql.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		List<estudiante>estudiante = estudianteRepo.findAll();
		
		estudiante.forEach(System.out :: println);
	
		
		System.exit(0);
	}

}
