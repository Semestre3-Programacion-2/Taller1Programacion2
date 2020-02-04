package co.edu.unbosque.model;

import java.util.Date;

public class PersonalSalFijo extends Personal{
	private double salario;
	private double porcentaje;
	
		public PersonalSalFijo(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, Date ano, double salario, double porcentaje) {
		super(apellidos, apellidos, apellidos, genero, telefono, apellidos, apellidos, ano);
		this.salario = salario;
		this.porcentaje = porcentaje;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
}
