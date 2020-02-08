package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controlador;
import co.edu.unbosque.model.IngJunior;
import co.edu.unbosque.model.IngSenior;
import co.edu.unbosque.model.Personal;
import co.edu.unbosque.model.PersonalCom;

public class VentanaPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelBotones pb;
	private PanelEmpleado pe;
	private VentanaLista vl;
	private VentanaRegistroEmpleado vre;
	private PanelModificar pm;
	private Controlador c;

	/**
	 * Construye un objeto de la clase Ventana Pricipal para poder adiminstra las diferentes acciones del programa
	 */
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
		c = new Controlador();
		pm = new PanelModificar();

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
		pm.getBoton().addActionListener(this);
	}
	/**
	 * 	<b>pre:</b>
	 * Todos los botones se han agregado su respectivo Action Listener
	 * <b>post:</b>
	 * Se ejecuta la accion especifica designada para cada boton
	 * @param e El actionEvent que ejecuto el metodo
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("lista")) {
			vl.setVisible(true);
		}else if(e.getActionCommand().equals("eliminarPrincipal")) {
			String eliminar = JOptionPane.showInputDialog(null, "Digite la cedula del usuario que desea eliminar", "ELIMINAR", JOptionPane.CLOSED_OPTION);
			if(c.Eliminar(eliminar)==true) {
				JOptionPane.showMessageDialog(null, "Usuario Elmininado Correctamente");
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario");
			}

		}else if(e.getActionCommand().equals("modificarPrincipal")) {
			String modificarString = JOptionPane.showInputDialog(null, "Digite la cedula del usuario que desea modificar", "MODIFICAR", JOptionPane.CLOSED_OPTION);
			Personal p1 = c.buscarTrabajador(modificarString);
			try {
				pm.getNombre_().setText(p1.getNombre());
				pm.getApellidos_().setText(p1.getApellidos());
				pm.getCedula_().setText(p1.getCedula());
				pm.getCorreo_().setText(p1.getCorreo());
				pm.getTelefono_().setText(Long.toString(p1.getTelefono()));
				pm.getDireccion_().setText(p1.getDireccion());
				pm.getFecha_().setDate(null);
				if(p1.getGenero()=='M') {
					pm.getGenero_().setSelectedItem("Masculino");
				}else {
					pm.getGenero_().setSelectedItem("Femenino");
				}
				pm.getCargo_().setEnabled(false);
				pm.setVisible(true);
			}catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}


		}else if(e.getActionCommand().equals("agregar")) {
			vre.setVisible(true);
			vre.getNombre_().setText(null);
			vre.getApellidos_().setText(null);
			vre.getCedula_().setText(null);
			vre.getCorreo_().setText(null);
			vre.getTelefono_().setText(null);
			vre.getDireccion_().setText(null);
			vre.getGenero_().setEnabled(true);
			vre.getFecha_().setDate(null);

		}else if(e.getActionCommand().equals("buscar")){
			pe.getAgregarcliente().setEnabled(true);	
			try {
				pe.getInfo().setText(c.buscarTrabajador(pe.getCampo().getText()).toString());
				if(c.buscarTrabajador(pe.getCampo().getText()).getClass()==IngJunior.class) {
					pe.getAgregarcliente().setEnabled(false);	
				}
			} catch (NullPointerException e2) {
				JOptionPane.showMessageDialog(null, "Empleado no encontrado");
			}

		}else if(e.getActionCommand().equals("agregarcliente")) {
			try {
				if(c.buscarTrabajador(pe.getCampo().getText()).getClass() == PersonalCom.class) {
					c.agregarCliente(pe.getCampo().getText(), JOptionPane.showInputDialog("Digite Cedula del cliente:"), Double.parseDouble(JOptionPane.showInputDialog("Ingresar monto del Contrato")));
				}else if(c.buscarTrabajador(pe.getCampo().getText()).getClass() == IngSenior.class){
					c.agregarCliente(pe.getCampo().getText());
					JOptionPane.showMessageDialog(null, "Se agrego cliente");
				}
			}catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(null, "Ingrese la cedula del empleado en el respectivo campo");

			}

		}else if(e.getActionCommand().equals("salario")) {
			try {
				Personal p1 = c.buscarTrabajador(pe.getCampo().getText());
				if(p1.getClass()==IngJunior.class) {
					pe.getInfo().setText(c.calcularSalarioIJ(p1.getCedula()));
				}else if(p1.getClass()==IngSenior.class) {
					pe.getInfo().setText(c.calcularSalarioIS(p1.getCedula()));
				}else if(p1.getClass()==PersonalCom.class) {
					pe.getInfo().setText(c.calcularSalarioC(p1.getCedula()));
				}
			}catch (NullPointerException n) {
				JOptionPane.showMessageDialog(null, "Ingrese la cedula del empleado en el respectivo campo");
			}

		}else if(e.getActionCommand().equals("eliminarlista")) {

		}else if(e.getActionCommand().equals("modificarlista")) {

		}else if(e.getActionCommand().equals("boton")) {

			if(vre.getCargo_().getSelectedItem().equals("Ingeniero Junior")) {
				int nivel=0;
				try {
					String aux = JOptionPane.showInputDialog("Digite el nivel del Ingeniero Junior");
					nivel = Integer.parseInt(aux);
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
				}
				char sexo;
				if(vre.getGenero_().getSelectedItem().equals("Masculino")) {
					sexo ='M';
				}else {
					sexo='F';
				}
				Date  fecha;
				DateFormat f;
				String fecha2 = null;
				try {
					fecha=vre.getFecha_().getDate();
					f =new SimpleDateFormat("dd/MM/yyyy");
					fecha2=f.format(fecha);
				if((c.agregarTrabajadorIngJ(vre.getCedula_().getText(), vre.getNombre_().getText(), vre.getApellidos_().getText(), sexo,	Long.parseLong(vre.getTelefono_().getText()), vre.getCorreo_().getText(), vre.getDireccion_().getText(),fecha2,nivel))==true) {
					JOptionPane.showMessageDialog(null, "Empleado Registardo Correctamente");

				}else {
					JOptionPane.showMessageDialog(null, "No se ha podido registrar el usuario");
				}
				}catch (NullPointerException e1) {
					JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
				}



			}else if(vre.getCargo_().getSelectedItem().equals("Ingeniero Senior")) {
				String aux = JOptionPane.showInputDialog("Digite el numero de ventas");

				int ventas = Integer.parseInt(aux);

				char sexo;
				if(vre.getGenero_().getSelectedItem().equals("Masculino")) {
					sexo = 'M';
				}else {
					sexo= 'F';
				}
				Date  fecha=vre.getFecha_().getDate();
				DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
				String fecha2=f.format(fecha);
				if((c.agregarTrabajadorIngS(vre.getCedula_().getText(), vre.getNombre_().getText(), vre.getApellidos_().getText(), sexo,	Long.parseLong(vre.getTelefono_().getText()), vre.getCorreo_().getText(), vre.getDireccion_().getText(),fecha2,ventas))==true) {
					JOptionPane.showMessageDialog(null, "Empleado Registardo Correctamente");

				}else {
					JOptionPane.showMessageDialog(null, "No se ha podido registrar el usuario");
				}
			}else if(vre.getCargo_().getSelectedItem().equals("Comision")) {
				char sexo;
				if(vre.getGenero_().getSelectedItem().equals("Masculino")) {
					sexo ='M';
				}else {
					sexo='F';
				}

				Date  fecha=vre.getFecha_().getDate();
				DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
				String fecha2=f.format(fecha);


				c.agregarTrabajadorCom(vre.getCedula_().getText(), vre.getNombre_().getText(), vre.getApellidos_().getText(), sexo,	 Long.parseLong(vre.getTelefono_().getText()), vre.getCorreo_().getText(), vre.getDireccion_().getText(),fecha2);
				JOptionPane.showMessageDialog(null, "Empleado Registardo Correctamente");
			}
			vre.setVisible(false);

		}else if(e.getActionCommand().equals("botonModificar")){
			Date  fecha=vre.getFecha_().getDate();
			DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
			String fecha2=f.format(fecha);
			char sexo;
			if(pm.getGenero_().getSelectedItem().equals("Masculino")) {
				sexo = 'M';
			}else {
				sexo= 'F';
			}
			c.Modificar(pm.getCedula_().getText(), pm.getNombre_().getText(), pm.getApellidos_().getText(),sexo,Long.parseLong(pm.getTelefono_().getText()), pm.getCorreo_().getText(), pm.getDireccion_().getText(), fecha2);
			JOptionPane.showMessageDialog(null, "Usuario modificado correctamente");
			pm.setVisible(false);
		}


	}

}
