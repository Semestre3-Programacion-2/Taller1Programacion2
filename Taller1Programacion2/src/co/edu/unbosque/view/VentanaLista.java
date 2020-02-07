package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaLista extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel logo,texto1,texto2;
	private ImageIcon foto;
	private JButton eliminar, modificar;
	private PanelListaEmpleados ple;

	public VentanaLista() {
		setTitle("LISTA");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    setBackground(new Color(45, 12, 148));
	    setBounds(0, 0, 400, 700);
	    
	    foto = new ImageIcon("src/co/edu/unbosque/images/logo.png");
		ImageIcon i = new ImageIcon(foto.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH));
		logo = new JLabel();
		logo.setIcon(i);
		
		texto1 =new JLabel("LISTA");
		texto1.setFont(new Font("Calibri", Font.BOLD, 40));
		texto2 = new JLabel("DE EMPLEADOS");
		texto2.setFont(new Font("Calibri", Font.BOLD, 30));
		
		eliminar = new JButton("");
		eliminar.setBorder(null);
		eliminar.setBorderPainted(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setFocusPainted(false);
		eliminar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar.png"));
		eliminar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar (1).png"));
		eliminar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_eliminar (2).png"));
		eliminar.setActionCommand("eliminarlista");
		
		modificar = new JButton("");
		modificar.setBorder(null);
		modificar.setBorderPainted(false);
		modificar.setContentAreaFilled(false);
		modificar.setFocusPainted(false);
		modificar.setIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar.png"));
		modificar.setRolloverIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar (1).png"));
		modificar.setPressedIcon(new ImageIcon("src/co/edu/unbosque/images/button_modificar (2).png"));
		modificar.setActionCommand("modificarlista");
		
		ple = new PanelListaEmpleados();
		

		add(logo).setBounds(5, 0, 130, 130);
		add(texto1).setBounds(135, 35, 100,100);
		add(texto2).setBounds(135, 60, 300, 100);
		add(eliminar).setBounds(10, 620, 162, 37);
		add(modificar).setBounds(220, 620, 162, 37);
		add(ple).setBounds(5, 100, 400, 600);
        setVisible(false);
	   
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JLabel getTexto1() {
		return texto1;
	}

	public void setTexto1(JLabel texto1) {
		this.texto1 = texto1;
	}

	public JLabel getTexto2() {
		return texto2;
	}

	public void setTexto2(JLabel texto2) {
		this.texto2 = texto2;
	}

	public ImageIcon getFoto() {
		return foto;
	}

	public void setFoto(ImageIcon foto) {
		this.foto = foto;
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

	public PanelListaEmpleados getPle() {
		return ple;
	}

	public void setPle(PanelListaEmpleados ple) {
		this.ple = ple;
	}
	
}
