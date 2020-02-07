package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelEmpleado extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto,cedula;
	private JTextField campo;
	private JTextArea info;
	private JButton buscar,agregarcliente, salario;
	public PanelEmpleado() {
		Color color = new Color(166, 165, 178);
		Font font = new Font("Calibri", Font.PLAIN, 16);
		setLayout(null);
		setBackground(color);
		
		campo = new JTextField("");
		campo.setFont(font);
		campo.setBackground(color);
		
		texto = new JLabel("INFO EMPLEADO");
		texto.setFont(new Font("Calibri", Font.BOLD, 20));
		
		cedula = new JLabel("Digite cedula del empleado: ");
		cedula.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		buscar = new JButton("");
		buscar.setBorder(null);
		buscar.setBorderPainted(false);
		buscar.setContentAreaFilled(false);
		buscar.setFocusPainted(false);
		buscar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_buscar.png"));
		buscar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_buscar (1).png"));
		buscar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_buscar (2).png"));
		buscar.setActionCommand("buscar");
		
		info = new JTextArea();
		info.setFont(new Font("Calibri", Font.BOLD, 16));
		info.setBackground(Color.BLACK);
		info.setForeground(Color.WHITE);
		
		agregarcliente = new JButton("");
		agregarcliente.setBorder(null);
		agregarcliente.setBorderPainted(false);
		agregarcliente.setContentAreaFilled(false);
		agregarcliente.setFocusPainted(false);
		agregarcliente.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar-cliente.png"));
		agregarcliente.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar-cliente (1).png"));
		agregarcliente.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar-cliente (2).png"));
		agregarcliente.setActionCommand("agregarcliente");
		
		salario = new JButton("");
		salario.setBorder(null);
		salario.setBorderPainted(false);
		salario.setContentAreaFilled(false);
		salario.setFocusPainted(false);
		salario.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_ver-salario.png"));
		salario.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_ver-salario (1).png"));
		salario.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_ver-salario (2).png"));
		salario.setActionCommand("salario");
		
		add(info).setBounds(30, 75, 450, 230);
		add(buscar).setBounds(320, 48, 143, 24);
		add(campo).setBounds(215, 50, 100, 20);
		add(texto).setBounds(30, 20, 200, 30);
		add(cedula).setBounds(30,50, 200, 20);
		add(agregarcliente).setBounds(30, 320, 155, 30);
		add(salario).setBounds(325, 320, 155, 30);
		
	}
	public JLabel getTexto() {
		return texto;
	}
	public void setTexto(JLabel texto) {
		this.texto = texto;
	}
	public JLabel getCedula() {
		return cedula;
	}
	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}
	public JTextField getCampo() {
		return campo;
	}
	public void setCampo(JTextField campo) {
		this.campo = campo;
	}
	public JTextArea getInfo() {
		return info;
	}
	public void setInfo(JTextArea info) {
		this.info = info;
	}
	public JButton getBuscar() {
		return buscar;
	}
	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}
	public JButton getAgregarcliente() {
		return agregarcliente;
	}
	public void setAgregarcliente(JButton agregarcliente) {
		this.agregarcliente = agregarcliente;
	}
	public JButton getSalario() {
		return salario;
	}
	public void setSalario(JButton salario) {
		this.salario = salario;
	}
	

}
