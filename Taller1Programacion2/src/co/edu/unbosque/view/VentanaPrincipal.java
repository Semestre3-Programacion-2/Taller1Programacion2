package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelBotones pb;
	private PanelEmpleado pe;
	private VentanaLista vl;
	private VentanaRegistroEmpleado vre;

	public VentanaPrincipal() {
		setTitle("ADMINISTRADOR");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(null);
	    setResizable(false);
	    setBounds(0, 0, 700, 400);
	    setLocationRelativeTo(null);
	    pb = new PanelBotones();
	    pe =new PanelEmpleado();
	    vl = new VentanaLista();
	    vre = new VentanaRegistroEmpleado();
	    add(pe).setBounds(170, 0, 530, 400);
	    add(pb).setBounds(0, 0, 170, 400);
	    
	    pb.getLista().addActionListener(this);
	    pb.getEliminar().addActionListener(this);
	    pb.getModificar().addActionListener(this);
	    pb.getAgregar().addActionListener(this);
	    
	    pe.getBuscar().addActionListener(this);
	    pe.getSalario().addActionListener(this);
	    pe.getAgregarcliente().addActionListener(this);
	    
	    vl.getEliminar().addActionListener(this);
	    vl.getModificar().addActionListener(this);
	    
	    vre.getBoton().addActionListener(this);
	}
	public static void main(String[] args) {
		VentanaPrincipal p1 = new VentanaPrincipal();
		p1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("lista")) {
			vl.setVisible(true);
		}else if(e.getActionCommand().equals("eliminarPrincipal")) {
			String eliminar = JOptionPane.showInputDialog(null, "Digite la cedula del usuario que desea eliminar", "ELIMINAR", JOptionPane.CLOSED_OPTION);

		}else if(e.getActionCommand().equals("modificarPrincipal")) {
			String modificarString = JOptionPane.showInputDialog(null, "Digite la cedula del usuario que desea modificar", "MODIFICAR", JOptionPane.CLOSED_OPTION);
			
		}else if(e.getActionCommand().equals("agregar")) {
			vre.setVisible(true);
			vre.getNombre_().setText("");
			vre.getApellidos_().setText("");
			vre.getCedula_().setText("");
			vre.getCorreo_().setText("");
			vre.getTelefono_().setText("");
			vre.getDireccion_().setText("");
			
		}else if(e.getActionCommand().equals("buscar")){

		}else if(e.getActionCommand().equals("agregarcliente")) {
			
		}else if(e.getActionCommand().equals("salario")) {

		}else if(e.getActionCommand().equals("eliminarlista")) {

		}else if(e.getActionCommand().equals("modificarlista")) {
			
		}else if(e.getActionCommand().equals("boton")) {
			
		}


	}

}
