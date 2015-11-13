package iteracion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import iteracion2.controlador.ContactoController_I2;
import iteracion1.dominio.Contacto_I1;

public class AppController_I2 extends iteracion1.controlador.AppController_I1 {
	
	public void startApplication(){
		super.startApplication();
		
		// Connect events
		
		getFrame().getBtnModificarContacto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarContacto();
			}
		});
		
	}
	
	public void modificarContacto(){
		
		int index = getFrame().getList().getSelectedIndex();
		
		if (index >= 0)
		{
			ContactoController_I2 contactoController_I2 = new ContactoController_I2(this);
			contactoController_I2.getFrame().setTitle("Modificar contacto");
			contactoController_I2.setContacto((Contacto_I1) getFrame().getList().getSelectedValue());
			contactoController_I2.populateContact();
			
			// Events
			contactoController_I2.connectEventGuardar();
			contactoController_I2.connectEventCancelar();
			
		}else{
			
			JOptionPane.showMessageDialog(
					getFrame(),
					"Selecciona un contacto a modificar",
					"Advertencia",
				    JOptionPane.WARNING_MESSAGE);
		}
	}
}
