package com.coomeva.h2.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private String username;
	private String password;
	private int identificacion;
	private int codigo_tipo_identificacion;
	private int codigo_estado;
	
}
