package co.edu.unbosque.controller;

import java.sql.Date;
import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class Controlador 
{

	private ArrayList<Personal> trabajadores;
	
	public Controlador() 
	{
		// TODO Auto-generated constructor stub
		trabajadores = new ArrayList<Personal>();
	}
	
	public Personal buscarTrabajador(String cedula)
	{
		Personal p = null;
		if(!trabajadores.isEmpty())
		{
			for(int i=0; i<trabajadores.size(); i++)
			{
				if(trabajadores.get(i).getCedula().equals(cedula))
				{
					p = trabajadores.get(i);
				}
			}
		}
		return p;
	}
	
	public Cliente buscarCliente(String cedula1, String cedula2)
	{
		Cliente c = null;
		Personal p = buscarTrabajador(cedula1);
		if(p!=null)
		{
			PersonalCom a = (PersonalCom)p;
			if(!a.getClientes().isEmpty())
			{
				for (int i = 0; i < a.getClientes().size(); i++)
				{
					if(a.getClientes().get(i).getCedula().equals(cedula2))
					{
						c = a.getClientes().get(i);
					}
				}
			}
		}
		return c;
	}
	
	public boolean agregarTrabajadorIngJ(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, String ano, int nivel)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new IngJunior(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, nivel);
			trabajadores.add(n);
			return true;
		}
		return false;
	}
	
	public boolean agregarTrabajadorIngS(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, String ano, int ventas)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new IngSenior(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, ventas);
			trabajadores.add(n);
			return true;
		}
		return false;
	}
	
	public boolean agregarTrabajadorCom(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, String ano)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new PersonalCom(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano);
			trabajadores.add(n);
			return true;
		}
		return false;
	}
	
	public void agregarCliente(String cedulaP, String cedulaC, double monto)
	{
		Cliente c = buscarCliente(cedulaP, cedulaC);
		PersonalCom a = (PersonalCom)buscarTrabajador(cedulaP);
		if(c==null)
		{
			c = new Cliente(cedulaC, monto);
			a.getClientes().add(c);
		}
	}
	
	public boolean Modificar(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, String ano)
	{
		Personal m = buscarTrabajador(cedula);
		if(m!=null)
		{
			m.setNombre(nombre);
			m.setApellidos(apellidos);
			m.setAno(ano);
			m.setCorreo(correo);
			m.setDireccion(direccion);
			m.setTelefono(telefono);
			m.setGenero(genero);
			return true;
		}
		return false;
	}
	
	public boolean Eliminar(String cedula)
	{
		Personal e = buscarTrabajador(cedula);
		if(e!=null)
		{
			trabajadores.remove(e);
			return true;
		}
		return false;
	}
	/**
	 * Metodo que permite al Trabajador Ingeniero Junior Ingresar un cliente nuevo
	 * @param cedulap Esta es la cedula del trabajador
	 */
	public void agregarCliente(String cedulap) {
		IngSenior is = (IngSenior) buscarTrabajador(cedulap);
		is.setVentas(is.getVentas()+1);
	}
	
	/**
	 * Permite calcular el salario del empleado Ingeniero Junior
	 * @param cedula es la cedula del empleado que se quiera saber el sueldo
	 * @return String aux devuelve un mensaje diciendo el nombre de la persona con su respectivo salario
	 */
	
	public String calcularSalarioIJ(String cedula) {
		IngJunior ij = (IngJunior) buscarTrabajador(cedula);
		String aux = "El salario de: "+ij.getNombre()+" es de: "+ij.calcularSalario();
		return aux;
	}
	
	/**
	 * Permite calcular el salario del empleado Ingeniero Senior
	 * @param cedula es la cedula del empleado que se quiera saber el sueldo
	 * @return String aux devuelve un mensaje diciendo el nombre de la persona con su respectivo salario
	 */
	
	public String calcularSalarioIS(String cedula) {
		IngSenior ij = (IngSenior) buscarTrabajador(cedula);
		String aux = "El salario de: "+ij.getNombre()+" es de: "+ij.calcularSalario();
		return aux;
	}
	
	/**
	 * Permite calcular el salario del empleado a comision
	 * @param cedula es la cedula del empleado que se quiera saber el sueldo
	 * @return String aux devuelve un mensaje diciendo el nombre de la persona con su respectivo salario
	 */
	
	public String calcularSalarioC(String cedula) {
		PersonalCom ij = (PersonalCom) buscarTrabajador(cedula);
		String aux = "El salario de: "+ij.getNombre()+" es de: "+ij.calcularSalario();
		return aux;
	}
}
