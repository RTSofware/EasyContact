package iteracion1.presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import iteracion1.controlador.ContactoController_I1;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ContactoUI_I1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ContactoController_I1 controller;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtMovil;
	private JTextField txtEmail;
	private JTextField txtDireccion;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Create the frame.
	 */
	public ContactoUI_I1(ContactoController_I1 controller) {
		setController(controller);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblApellido = new JLabel("Apellido");
		JLabel lblTelfono = new JLabel("Teléfono");
		JLabel lblMvil = new JLabel("Móvil");
		JLabel lblDireccin = new JLabel("Dirección");
		JLabel lblEmail = new JLabel("Email");
		
		setTxtNombre(new JTextField());
		getTxtNombre().setColumns(10);
		
		setTxtApellido(new JTextField());
		getTxtApellido().setColumns(10);
		
		setTxtTelefono(new JTextField());
		getTxtTelefono().setColumns(10);
		
		setTxtMovil(new JTextField());
		getTxtMovil().setColumns(10);
		
		setTxtEmail(new JTextField());
		getTxtEmail().setColumns(10);
		
		setTxtDireccion(new JTextField());
		getTxtDireccion().setColumns(10);
		
		setBtnGuardar( new JButton("Guardar"));		
		setBtnCancelar(new JButton("Cerrar"));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblApellido)
								.addComponent(lblTelfono)
								.addComponent(lblMvil)
								.addComponent(lblEmail)
								.addComponent(lblDireccin))
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtTelefono, Alignment.LEADING)
									.addComponent(txtMovil, Alignment.LEADING))
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addComponent(txtDireccion, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnCancelar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnGuardar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelfono)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMvil)
						.addComponent(txtMovil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccin)
						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(btnCancelar)
					.addGap(18)
					.addComponent(btnGuardar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public ContactoController_I1 getController() {
		return controller;
	}

	public void setController(ContactoController_I1 controller) {
		this.controller = controller;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtMovil() {
		return txtMovil;
	}

	public void setTxtMovil(JTextField txtMovil) {
		this.txtMovil = txtMovil;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}
