package com.tuempresa.SistemaReservasEventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


@SpringBootApplication
//@EnableSwagger2
public class SistemaReservasEventosApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SistemaReservasEventosApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
		app.run(args);
	}

}
