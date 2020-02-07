package co.edu.unbosque.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class PanelListaEmpleados extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<String> listaEmpleados;
	  private DefaultListModel<String> modeloLista;
	  private JScrollPane desplazamiento;
	public PanelListaEmpleados() {
		setLayout(null);
	    listaEmpleados = new JList<String>();
	    modeloLista = new DefaultListModel<String>();
	    listaEmpleados.setModel(modeloLista);
	    listaEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    desplazamiento = new JScrollPane(listaEmpleados);
	    desplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    desplazamiento.setOpaque(false);
	    add(desplazamiento).setBounds(20, 30, 350, 470);
	    
	}

}
