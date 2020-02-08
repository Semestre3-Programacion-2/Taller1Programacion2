package co.edu.unbosque.model;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.ArrayList;


public class PersonalCom extends Personal implements CalcularSalario{
	private double salario;
	private ArrayList<Cliente> Clientes;
	private double monto;
	
		public PersonalCom(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, String ano) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
	Clientes = new ArrayList<Cliente>();
	}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public ArrayList<Cliente> getClientes() {
			return Clientes;
		}

		public void setClientes(ArrayList<Cliente> clientes) {
			Clientes = clientes;
		}

		public double getMonto() {
			return monto;
		}

		public void setMonto(double monto) {
			this.monto = monto;
		}

		@Override
		public double calcularSalario() {
			for (int i = 0; i < Clientes.size(); i++) {
				monto = monto + Clientes.get(i).getMonto();
			}
			salario = 1100000;
			if(monto<=800000) {
				salario = salario + 800000;
			}else if(monto>800000) {
				salario = salario + monto;
			}
			return salario;
		}
		
}
