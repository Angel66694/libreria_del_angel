package com.aluraclass.angel_libreria;

import com.aluraclass.angel_libreria.principal.Principal;
//import com.aluraclass.angel_libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngelLibreriaApplication implements CommandLineRunner{

	@Autowired
	//private LibroRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AngelLibreriaApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();


	}

}
