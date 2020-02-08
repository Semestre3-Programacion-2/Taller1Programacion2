package co.edu.unbosque.model;

import java.util.Date;

public class IngJunior extends PersonalSalFijo implements CalcularSalario{
	private int nivel;

		public IngJunior(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, String ano, int nivel) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
		this.nivel = nivel;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	@Override
	public double calcularSalario() {
		salario = 3500000;
		char[] cadena = ano.toCharArray();
		String aux = Character.toString(cadena[6])+Character.toString(cadena[7])+Character.toString(cadena[8])+Character.toString(cadena[9]);
		int fecha = Integer.parseInt(aux);
		if((2019-fecha)<=3) {
			salario = salario + (salario*0.05);
		}else if(2019-fecha>3&&2019-fecha<=7) {
			salario = salario + (salario*0.10);
		}else if(2019-fecha>3&&2019-fecha<=7) {
			salario = salario + (salario*0.10);
		}else if(2019-fecha>7&&2019-fecha<=15) {
			salario = salario + (salario*0.15);
		}else if(2019-fecha>15) {
			salario = salario + (salario*0.20);
		}else if(nivel==2||nivel==3) {
			salario = salario + (salario*0.05);
		}else if(nivel==4||nivel==5) {
			salario = salario + (salario*0.08);
		}
		return salario;
	}
}
