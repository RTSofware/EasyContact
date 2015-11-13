package iteracion1.controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import iteracion1.dominio.Contacto_I1;
import iteracion1.presentacion.ContactoUI_I1;

public class ContactoController_I1 {
	
	private ContactoUI_I1 frame;
	private AppController_I1 appController;
	private Contacto_I1 contacto;
	
	public ContactoController_I1(AppController_I1 appController){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setAppController(appController);
		setFrame(new ContactoUI_I1(this));
		
		 // make the frame a quarter the height and half width
		getFrame().setSize(screenSize.width/4, screenSize.height/2);
		
		// center the JFrame on screen
		getFrame().setLocationRelativeTo(null);
		getFrame().setVisible(true);
	}
	
	public void connectEventCancelar(){
		
		getFrame().getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
	}
	
	public void connectEventGuardar(){
		
		getFrame().getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
	}
	
	public void populateContact(){
			
		getFrame().getTxtNombre().setText(getContacto().getNombre());
		getFrame().getTxtApellido().setText(getContacto().getApellido());
		getFrame().getTxtTelefono().setText(getContacto().getTelefono());
		getFrame().getTxtMovil().setText(getContacto().getMovil());
		getFrame().getTxtEmail().setText(getContacto().getEmail());
		getFrame().getTxtDireccion().setText(getContacto().getDireccion());
	}
	
	public void setEditable(boolean value)
	{
		if (value){
	
			getFrame().getTxtNombre().setEditable(true);
			getFrame().getTxtApellido().setEditable(true);
			getFrame().getTxtTelefono().setEditable(true);
			getFrame().getTxtMovil().setEditable(true);
			getFrame().getTxtEmail().setEditable(true);
			getFrame().getTxtDireccion().setEditable(true);
			
			getFrame().getBtnGuardar().setVisible(true);
			
		}else{
			
			getFrame().getTxtNombre().setEditable(false);
			getFrame().getTxtApellido().setEditable(false);
			getFrame().getTxtTelefono().setEditable(false);
			getFrame().getTxtMovil().setEditable(false);
			getFrame().getTxtEmail().setEditable(false);
			getFrame().getTxtDireccion().setEditable(false);
			
			getFrame().getBtnGuardar().setVisible(false);
		}
	}
	
	public void close(){
		getFrame().dispose();
	}
	
	public void save(){
		
		if (getFrame().getTxtNombre().getText().isEmpty()){
			
			JOptionPane.showMessageDialog(
					getFrame(),
					"El campo \"Nombre\" no puede estar vacío",
					"Advertencia",
				    JOptionPane.WARNING_MESSAGE);
			
		}else{
			
			Contacto_I1 contactoNuevo = new Contacto_I1(
					getFrame().getTxtNombre().getText(),
					getFrame().getTxtApellido().getText(),
					getFrame().getTxtTelefono().getText(),
					getFrame().getTxtMovil().getText(),
					getFrame().getTxtEmail().getText(),
					getFrame().getTxtDireccion().getText()
					);
			
			getAppController().getAgenda().addContacto(contactoNuevo);
					
			
			// Update the list of contacts
			getAppController().showContacts();
			close();
		}
	}

	public ContactoUI_I1 getFrame() {
		return frame;
	}

	public void setFrame(ContactoUI_I1 frame) {
		this.frame = frame;
	}

	public AppController_I1 getAppController() {
		return appController;
	}

	public void setAppController(AppController_I1 appController) {
		this.appController = appController;
	}

	public Contacto_I1 getContacto() {
		return contacto;
	}

	public void setContacto(Contacto_I1 contacto) {
		this.contacto = contacto;
	}

}
