package co.edu.unbosque.model;


public class IngSenior extends PersonalSalFijo implements CalcularSalario{
	private int ventas;
	
		public IngSenior(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, String ano, int ventas) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
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
			char[] cadena = ano.toCharArray();
			String aux = Character.toString(cadena[6])+Character.toString(cadena[7])+Character.toString(cadena[8])+Character.toString(cadena[9]);
			int fecha = Integer.parseInt(aux);
			salario = 3500000;
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
			}
			if(ventas>=1&&ventas<=5) {
				salario = salario + (salario*0.10);
			}else if(ventas>5&&ventas<=10) {
				salario = salario + (salario*0.15);
			}else if(ventas>10&&ventas<=20) {
				salario = salario + (salario*0.20);
			}else if(ventas>21) {
				salario = salario + (salario*0.30);
			}
			return salario;
		}
		

}
