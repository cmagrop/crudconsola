package com.example.crudconsola;

import com.example.crudconsola.entities.Cliente;
import com.example.crudconsola.repositories.ClienteRepository;
import com.example.crudconsola.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class CrudConsolaApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository repositoryCliente;

	public static void main(String[] args)  {

		//SpringApplication.run(CrudConsolaApplication.class, args);
		SpringApplication.run(CrudConsolaApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hola");
		createCliente();


	}

	@Transactional
	public void createCliente() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Nombre");
		String nombre = scanner.nextLine();
		System.out.println("Primer Apellido");
		String apel1 = scanner.nextLine();
		System.out.println("Segundo Apellido");
		String apel2 = scanner.nextLine();
		System.out.println("Nacionalidad");
		String nacionalidad = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento");
		String fnac = scanner.nextLine();
		SimpleDateFormat dNac = new SimpleDateFormat("yyyy-mm-dd");
		Date fechaDate = dNac.parse(fnac);
		System.out.println("Ingrese 1: femenino, 2: masculino");
		Integer sexo = scanner.nextInt();
		System.out.print("Ingrese direccion:");
		String direccion = scanner.nextLine();
		System.out.println("Ingrese comuna");
		String comuna = scanner.nextLine();
		System.out.println("Email:");
		String email = scanner.next();
		System.out.println("Telefono:");
		String telefono=scanner.next();
		System.out.println("Ingrese password");
		String password = scanner.next();
		System.out.println("Tipo de documento 1: cedula de identidad 2: pasaporte");
		Integer tipoDocumento = scanner.nextInt();
		System.out.println("Ingrese Identificador Documento");
		String idDocumento = scanner.next();
		scanner.close();
*/
		System.out.println("Nombre");
		String nombre = scanner.nextLine();
		System.out.println("Primer Apellido");
		String apel1 = scanner.nextLine();
		System.out.println("Segundo Apellido");
		String apel2 = scanner.nextLine();
		System.out.println("Nacionalidad");
		String nacionalidad = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento");
		String fnac = scanner.nextLine();
		SimpleDateFormat dNac = new SimpleDateFormat("yyyy-MM-dd"); // Use MM for months
		Date fechaDate = dNac.parse(fnac);
		System.out.println("Ingrese 1: femenino, 2: masculino");
		Integer sexo = scanner.nextInt();
		scanner.nextLine(); // Consume the rest of the line
		System.out.print("Ingrese direccion:");
		String direccion = scanner.nextLine();
		System.out.println("Ingrese comuna");
		String comuna = scanner.nextLine();
		System.out.println("Email:");
		String email = scanner.next();
		scanner.nextLine(); // Consume the rest of the line
		System.out.println("Telefono:");
		String telefono=scanner.next();
		scanner.nextLine(); // Consume the rest of the line
		System.out.println("Ingrese password");
		String password = scanner.next();
		scanner.nextLine(); // Consume the rest of the line
		System.out.println("Tipo de documento 1: cedula de identidad 2: pasaporte");
		Integer tipoDocumento = scanner.nextInt();
		scanner.nextLine(); // Consume the rest of the line
		System.out.println("Ingrese Identificador Documento");
		String idDocumento = scanner.next();
		scanner.close();

		//crear a un cliente
		Cliente cliente= new Cliente(null,tipoDocumento,idDocumento,password,nombre,apel1,apel2,nacionalidad,fechaDate,sexo,direccion,comuna,email,telefono);

		repositoryCliente.save(cliente);


	}




}
