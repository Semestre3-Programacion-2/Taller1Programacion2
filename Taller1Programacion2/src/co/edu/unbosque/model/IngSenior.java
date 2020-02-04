package co.edu.unbosque.model;

import java.util.Date;

public class IngSenior extends PersonalSalFijo{
	private int ventas;
	
		public IngSenior(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, Date ano, double salario, double porcentaje, int ventas) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, salario, porcentaje);
		this.ventas = ventas;
	}

		public int getVentas() {
			return ventas;
		}

		public void setVentas(int ventas) {
			this.ventas = ventas;
		}

}
