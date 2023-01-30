package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaRepository;

@SpringBootTest
class Jpa2301ApplicationTests {
	
	@Autowired
	PersonaRepository personaRepository;

	@Test
	void contextLoads() {
		personaRepository.save(new Persona(1, "Antonio"));
		System.out.println("hecho");
	}

}
