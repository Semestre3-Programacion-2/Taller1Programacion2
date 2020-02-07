package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton agregar,lista,eliminar,modificar;
	private JLabel imagen,admin;
	private ImageIcon foto;
	
	public PanelBotones() {
		setLayout(null);
		Color color = new Color(45, 12, 148);
		Font font = new Font("Calibri", Font.BOLD, 24);
		setBackground(color);
		admin = new JLabel("EMPLEADOS");
		admin.setFont(font);
		admin.setBackground(color);
		admin.setForeground(Color.WHITE);
		
		foto = new ImageIcon("src/co/edu/unbosque/images/logo.png");
		ImageIcon i = new ImageIcon(foto.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH));
		imagen = new JLabel();
		imagen.setIcon(i);
		
		agregar = new JButton("");
		agregar.setBorder(null);
		agregar.setBorderPainted(false);
		agregar.setContentAreaFilled(false);
		agregar.setFocusPainted(false);
		agregar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar.png"));
		agregar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar (1).png"));
		agregar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_agregar (2).png"));
		agregar.setActionCommand("agregar");
		
		lista = new JButton("");
		lista.setBorder(null);
		lista.setBorderPainted(false);
		lista.setContentAreaFilled(false);
		lista.setFocusPainted(false);
		lista.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_lista.png"));
		lista.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_lista (1).png"));
		lista.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_lista (2).png"));
		lista.setActionCommand("lista");
		
		eliminar = new JButton("");
		eliminar.setBorder(null);
		eliminar.setBorderPainted(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setFocusPainted(false);
		eliminar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar.png"));
		eliminar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar (1).png"));
		eliminar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar (2).png"));
		eliminar.setActionCommand("eliminarPrincipal");
		
		modificar = new JButton("");
		modificar.setBorder(null);
		modificar.setBorderPainted(false);
		modificar.setContentAreaFilled(false);
		modificar.setFocusPainted(false);
		modificar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar.png"));
		modificar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar (1).png"));
		modificar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar (2).png"));
		modificar.setActionCommand("modificarPrincipal");
		
		add(imagen).setBounds(20, -30, 200, 200);
		add(agregar).setBounds(2, 170, 162, 37);;
		add(eliminar).setBounds(2, 220, 162, 37);
		add(lista).setBounds(2, 270, 162, 37);
		add(modificar).setBounds(2, 320, 162, 37);
		add(admin).setBounds(5, 140, 200, 30);
		
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getLista() {
		return lista;
	}

	public void setLista(JButton lista) {
		this.lista = lista;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}
	

}
