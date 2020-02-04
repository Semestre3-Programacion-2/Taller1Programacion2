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
	
	public void agregarTrabajadorIngJ(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, Date ano, double salario, double porcentaje, int nivel)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new IngJunior(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, salario, porcentaje, nivel);
			trabajadores.add(n);
		}
	}
	
	public void agregarTrabajadorIngS(String cedula, String nombre, String apellidos, char genero,
				long telefono, String correo,String direccion, Date ano, double salario, double porcentaje, int ventas)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new IngSenior(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, salario, porcentaje, ventas);
			trabajadores.add(n);
		}
	}
	
	public void agregarTrabajadorCom(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, Date ano, double salario, ArrayList<Cliente> clientes, double monto)
	{
		Personal n = buscarTrabajador(cedula);
		if(n==null)
		{
			n = new PersonalCom(cedula, nombre, apellidos, genero, telefono, correo, direccion, ano, salario, clientes, monto);
			trabajadores.add(n);
		}
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
	
	public void Modificar(String cedula, String nombre, String apellidos, char genero,
			long telefono, String correo,String direccion, Date ano)
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
		}
	}
	
	public void Eliminar(String cedula)
	{
		Personal e = buscarTrabajador(cedula);
		if(e!=null)
		{
			trabajadores.remove(e);
		}
	}
}
