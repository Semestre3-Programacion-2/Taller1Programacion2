package co.edu.unbosque.model;

import java.util.Date;

public class IngJunior extends PersonalSalFijo{
	private int nivel;

		public IngJunior(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, Date ano, double salario, double porcentaje, int nivel) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, salario, porcentaje);
		this.nivel = nivel;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
