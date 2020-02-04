package co.edu.unbosque.model;

import java.util.Date;

public class PersonalSalFijo extends Personal implements CalcularSalario{
	protected double salario;
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
		}
		return salario;
	}
}
