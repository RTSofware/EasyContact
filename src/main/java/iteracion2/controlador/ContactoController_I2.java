package iteracion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import iteracion1.controlador.AppController_I1;
import iteracion1.dominio.Contacto_I1;

public class ContactoController_I2 extends iteracion1.controlador.ContactoController_I1{

	public ContactoController_I2(AppController_I1 appController_I1) {
		super(appController_I1);
		// TODO Auto-generated constructor stub
	}
	
	public void connectEventGuardar(){
		
		getFrame().getBtnGuardar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
	}
	
	public void update(){
		
		if (getFrame().getTxtNombre().getText().isEmpty()){
			
			JOptionPane.showMessageDialog(
					getFrame(),
					"El campo \"Nombre\" no puede estar vacío",
					"Advertencia",
				    JOptionPane.WARNING_MESSAGE);
			
		}else{
			
			Contacto_I1 contactoModificado = getContacto();
			
			// Update contacto
			contactoModificado.setNombre(getFrame().getTxtNombre().getText());
			contactoModificado.setApellido(getFrame().getTxtApellido().getText());
			contactoModificado.setTelefono(getFrame().getTxtTelefono().getText());
			contactoModificado.setMovil(getFrame().getTxtMovil().getText());
			contactoModificado.setEmail(getFrame().getTxtEmail().getText());
			contactoModificado.setDireccion(getFrame().getTxtDireccion().getText());
			
			getAppController().getAgenda().updateContacto(contactoModificado);
			
			// Update the list of contacts
			getAppController().showContacts();
			close();
		}
	}
}
