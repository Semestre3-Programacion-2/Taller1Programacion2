package co.edu.unbosque.model;

import java.util.Date;

public class PersonalSalFijo extends Personal implements CalcularSalario{
	protected double salario;
	private double porcentaje;
	
		public PersonalSalFijo(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, String ano) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
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
	@Override
	public double calcularSalario() {
		return salario;
	}
}
