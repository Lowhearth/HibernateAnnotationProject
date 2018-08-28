package com.netmind.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "IdCliente")
	private int idCliente;
	
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellidos")
	private String apelidos;
	@Column(name = "Dni")
	private String dni;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apelidos;
	}
	public void setApellidos(String appelidos) {
		this.apelidos = appelidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Cliente(int idCliente, String nombre, String appelidos, String dni) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apelidos = appelidos;
		this.dni = dni;
	}
	
	public Cliente() {
		
	}
	

}
