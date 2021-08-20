package com.coomeva.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coomeva.h2.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
