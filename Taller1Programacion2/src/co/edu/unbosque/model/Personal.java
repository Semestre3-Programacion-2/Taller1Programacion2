package co.edu.unbosque.model;

import java.util.Date;

public class Personal {
	private String cedula;
	private String nombre;
	private String apellidos;
	private char genero;
	private long telefono;
	private String correo;
	private String direccion;
	private Date ano;
	
		public Personal(String cedula, String nombre, String apellidos, char genero,
		long telefono, String correo,String direccion, Date ano) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.ano = ano;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	
}
