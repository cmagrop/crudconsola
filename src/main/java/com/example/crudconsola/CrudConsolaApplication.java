package com.example.crudconsola;

import com.example.crudconsola.repositories.EspecialidadRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudConsolaApplication implements CommandLineRunner {


	public static void main(String[] args)  {

		//SpringApplication.run(CrudConsolaApplication.class, args);
		SpringApplication.run(CrudConsolaApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hola");

	}




}