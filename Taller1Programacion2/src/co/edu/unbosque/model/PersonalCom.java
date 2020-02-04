package co.edu.unbosque.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class PersonalCom extends Personal implements CalcularSalario{
	private double salario;
	private ArrayList<Cliente> Clientes;
	private double monto;
	
		public PersonalCom(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, Date ano, double salario, ArrayList<Cliente> clientes, double monto) {
		super(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
		this.salario = salario;
		Clientes = clientes;
		this.monto = monto;
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
			salario = 1100000;
			if(monto<=800000) {
				salario = salario + 800000;
			}else if(monto>800000) {
				salario = salario + monto;
			}
			return salario;
		}
		
}
