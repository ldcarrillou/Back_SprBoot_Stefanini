package com.coomeva.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coomeva.h2.dao.IPersonaRepository;
import com.coomeva.h2.model.Persona;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaRepository repository;
	
	@PostMapping("/savePersona")
	public String savePersona(@RequestBody Persona persona) {
		repository.save(persona);
		return "Persona salvada...";
	}
	
	@GetMapping("/getAllPersonas")
	public List<Persona> getAll() {
		
		return repository.findAll();
	}
	
	public Persona getPersonaById(int codigo) {
		//return repository.findById(codigo);
		return null;
	}
}
