package co.edu.unbosque.model;


public class Personal {
	protected String cedula;
	protected String nombre;
	protected String apellidos;
	protected char genero;
	protected long telefono;
	protected String correo;
	protected String direccion;
	protected String ano;
	
		public Personal(String cedula, String nombre, String apellidos, char genero,
		long telefono, String correo,String direccion, String ano) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.ano = ano;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+nombre+"\nApellidos: "+apellidos +"\nCedula: "+cedula+"\nCorreo: "+correo+"\nTelefono: "+telefono+"\nFecha de ingreso: "+ 
				ano;
	}
	
}
