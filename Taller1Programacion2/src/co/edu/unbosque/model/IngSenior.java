package co.edu.unbosque.model;

import java.util.Date;

public class IngSenior extends PersonalSalFijo implements CalcularSalario{
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
		@Override
		public double calcularSalario() {
			if((2019-ano.getYear())<=3) {
				salario = salario + (salario*0.05);
			}else if(2019-ano.getYear()>3&&2019-ano.getYear()<=7) {
				salario = salario + (salario*0.10);
			}else if(2019-ano.getYear()>3&&2019-ano.getYear()<=7) {
				salario = salario + (salario*0.10);
			}else if(2019-ano.getYear()>7&&2019-ano.getYear()<=15) {
				salario = salario + (salario*0.15);
			}else if(2019-ano.getYear()>15) {
				salario = salario + (salario*0.20);
			}else if(ventas>=1&&ventas<=5) {
				salario = salario + (salario*0.10);
			}else if(ventas>6&&ventas<=10) {
				salario = salario + (salario*0.15);
			}else if(ventas>10&&ventas<=20) {
				salario = salario + (salario*0.20);
			}else if(ventas>21) {
				salario = salario + (salario*0.30);
			}
			return salario;
		}
		

}
