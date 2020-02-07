package co.edu.unbosque.view;


import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import com.toedter.calendar.JDateChooser;

public class VentanaRegistroEmpleado extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel cedula,nombre,apellidos,telefono,correo,direccion,texto,cargo,genero,fecha;
	private JTextField cedula_,nombre_,apellidos_,telefono_,correo_,direccion_;
	private JComboBox<String> cargo_,genero_;
	private JDateChooser fecha_;
	private JButton boton;

	public VentanaRegistroEmpleado() {
		
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    setBounds(0, 0, 300, 350);
	    Font font = new Font("Calibri", Font.PLAIN, 14);
	    texto = new JLabel("Registro Empleado");
	    texto.setFont(new Font("Calibri", Font.BOLD, 25));
	    cedula =new JLabel("Cedula:");
	    cedula.setFont(new Font("Calibri", Font.BOLD, 15));
	    nombre = new JLabel("Nombre:");
	    nombre.setFont(new Font("Calibri", Font.BOLD, 15));
	    apellidos = new JLabel("Apellidos:");
	    apellidos.setFont(new Font("Calibri", Font.BOLD, 15));
	    telefono =new JLabel("Telefono:");
	    telefono.setFont(new Font("Calibri", Font.BOLD, 15));
	    correo = new JLabel("Correo:");
	    correo.setFont(new Font("Calibri", Font.BOLD, 15));
	    direccion = new JLabel("Direccion:");
	    direccion.setFont(new Font("Calibri", Font.BOLD, 15));
	    cargo = new JLabel("Cargo: ");
	    cargo.setFont(new Font("Calibri", Font.BOLD, 15));
	    genero = new JLabel("Genero: ");
	    genero.setFont(new Font("Calibri", Font.BOLD, 15));
	    fecha = new JLabel("Fecha Ingreso: ");
	    fecha.setFont(new Font("Calibri", Font.BOLD, 15));
	    nombre_ = new JTextField();
	    nombre_.setFont(font);
	    apellidos_ = new JTextField();
	    apellidos_.setFont(font);
	    cedula_ = new JTextField();
	    cedula_.setFont(font);
	    telefono_ = new JTextField();
	    telefono_.setFont(font);
	    correo_ = new JTextField();
	    correo_.setFont(font);
	    direccion_ = new JTextField();
	    direccion_.setFont(font);
	    cargo_= new JComboBox<String>();
	    cargo_.setFont(font);
	    cargo_.addItem("Salario Fijo");
	    cargo_.addItem("Ingeniero Junior");
	    cargo_.addItem("Ingeniero Senior");
	    cargo_.addItem("Comision");
	    genero_= new JComboBox<String>();
	    genero_.setFont(font);
	    genero_.addItem("Masculino");
	    genero_.addItem("Femenino");
	    fecha_ = new JDateChooser();
		fecha_.setDateFormatString("dd/MM/yyyy");
		fecha_.setFont(font);
		boton = new JButton("");
		boton.setBorder(null);
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setFocusPainted(false);
		boton.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_registrar.png"));
		boton.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_registrar (1).png"));
		boton.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_registrar (2).png"));
		boton.setActionCommand("boton");
		
	    
	    add(texto).setBounds(5, 10, 200, 30);
	    add(nombre).setBounds(20, 50, 100, 20);
	    add(apellidos).setBounds(20, 70, 100, 20);
	    add(cedula).setBounds(20, 90, 100, 20);
	    add(telefono).setBounds(20, 110, 100, 20);
	    add(correo).setBounds(20, 130, 100, 20);
	    add(direccion).setBounds(20, 150, 100, 20);
	    add(cargo).setBounds(20, 170, 100, 20);
	    add(genero).setBounds(20, 190, 100, 20);
	    add(fecha).setBounds(20, 210, 120, 20);
	    add(nombre_).setBounds(130, 50, 150, 20);
	    add(apellidos_).setBounds(130, 70, 150, 20);
	    add(cedula_).setBounds(130, 90, 150, 20);
	    add(telefono_).setBounds(130, 110, 150, 20);
	    add(correo_).setBounds(130, 130, 150, 20);
	    add(direccion_).setBounds(130, 150, 150, 20);
	    add(cargo_).setBounds(130, 170, 150, 20);
	    add(genero_).setBounds(130, 190, 150, 20);
	    add(fecha_).setBounds(130, 210, 150, 20);
	    add(boton).setBounds(80, 250, 137, 34);
	
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellidos() {
		return apellidos;
	}

	public void setApellidos(JLabel apellidos) {
		this.apellidos = apellidos;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JLabel getCargo() {
		return cargo;
	}

	public void setCargo(JLabel cargo) {
		this.cargo = cargo;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getFecha() {
		return fecha;
	}

	public void setFecha(JLabel fecha) {
		this.fecha = fecha;
	}

	public JTextField getCedula_() {
		return cedula_;
	}

	public void setCedula_(JTextField cedula_) {
		this.cedula_ = cedula_;
	}

	public JTextField getNombre_() {
		return nombre_;
	}

	public void setNombre_(JTextField nombre_) {
		this.nombre_ = nombre_;
	}

	public JTextField getApellidos_() {
		return apellidos_;
	}

	public void setApellidos_(JTextField apellidos_) {
		this.apellidos_ = apellidos_;
	}

	public JTextField getTelefono_() {
		return telefono_;
	}

	public void setTelefono_(JTextField telefono_) {
		this.telefono_ = telefono_;
	}

	public JTextField getCorreo_() {
		return correo_;
	}

	public void setCorreo_(JTextField correo_) {
		this.correo_ = correo_;
	}

	public JTextField getDireccion_() {
		return direccion_;
	}

	public void setDireccion_(JTextField direccion_) {
		this.direccion_ = direccion_;
	}

	public JComboBox getCargo_() {
		return cargo_;
	}

	public void setCargo_(JComboBox cargo_) {
		this.cargo_ = cargo_;
	}

	public JComboBox getGenero_() {
		return genero_;
	}

	public void setGenero_(JComboBox genero_) {
		this.genero_ = genero_;
	}

	public JDateChooser getFecha_() {
		return fecha_;
	}

	public void setFecha_(JDateChooser fecha_) {
		this.fecha_ = fecha_;
	}

	public JButton getBoton() {
		return boton;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}
	

}
