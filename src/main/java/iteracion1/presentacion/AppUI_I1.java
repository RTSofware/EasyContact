package iteracion1.presentacion;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import iteracion1.controlador.AppController_I1;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class AppUI_I1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AppController_I1 controller;
	private JPanel contentPane;
	private JButton btnSalir;
	private JButton btnModificarContacto;
	private JButton btnBorrarContacto;
	private JButton btnBuscarContacto;
	private JButton btnAgregarContacto;
	private JScrollPane scrollPane;
	private JList<Object> list;

	/**
	 * Create the frame.
	 */
	public AppUI_I1(AppController_I1 controller) {
		setTitle("Agenda Monolitica");
		setController(controller);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setBtnAgregarContacto(new JButton("Agregar contacto"));
		setBtnSalir(new JButton("Salir"));
		setBtnModificarContacto(new JButton("Modificar contacto"));
		setBtnBorrarContacto(new JButton("Borrar contacto"));
		setBtnBuscarContacto(new JButton("Buscar contacto"));
		
		scrollPane = new JScrollPane();
		
		{
			setList(new JList<Object>());
			getList().setCellRenderer(new ContactoListRenderer_I1());
			scrollPane.setViewportView(getList());
		}
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnModificarContacto, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addComponent(btnAgregarContacto, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addComponent(btnBorrarContacto, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addComponent(btnBuscarContacto, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addComponent(btnSalir))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAgregarContacto)
							.addGap(18)
							.addComponent(btnModificarContacto)
							.addGap(18)
							.addComponent(btnBorrarContacto)
							.addGap(18)
							.addComponent(btnBuscarContacto)
							.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
							.addComponent(btnSalir)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public AppController_I1 getController() {
		return controller;
	}

	public void setController(AppController_I1 controller) {
		this.controller = controller;
	}
	
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnModificarContacto() {
		return btnModificarContacto;
	}

	public void setBtnModificarContacto(JButton btnModificarContacto) {
		this.btnModificarContacto = btnModificarContacto;
	}

	public JButton getBtnBorrarContacto() {
		return btnBorrarContacto;
	}

	public void setBtnBorrarContacto(JButton btnBorrarContacto) {
		this.btnBorrarContacto = btnBorrarContacto;
	}

	public JButton getBtnBuscarContacto() {
		return btnBuscarContacto;
	}

	public void setBtnBuscarContacto(JButton btnBuscarContacto) {
		this.btnBuscarContacto = btnBuscarContacto;
	}

	public JButton getBtnAgregarContacto() {
		return btnAgregarContacto;
	}

	public void setBtnAgregarContacto(JButton btnAgregarContacto) {
		this.btnAgregarContacto = btnAgregarContacto;
	}

	public JList<Object> getList() {
		return list;
	}

	public void setList(JList<Object> list) {
		this.list = list;
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
