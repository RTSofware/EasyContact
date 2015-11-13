package iteracion3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import iteracion1.dominio.Contacto_I1;

public class AppController_I3 extends iteracion2.controlador.AppController_I2 {
	
	public void startApplication(){
		super.startApplication();
		
		// Connect events
		
		getFrame().getBtnBorrarContacto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarContacto();
			}
		});
		
	}
	
	public void borrarContacto(){
		
		int index = getFrame().getList().getSelectedIndex();
		
		if (index >= 0)
		{
			int dialogResult = JOptionPane.showConfirmDialog (null,
					"¿Desea borrar el contacto?",
					"Advertencia",
					JOptionPane.YES_NO_OPTION);
			
			if (dialogResult == JOptionPane.YES_OPTION)
			{
				getAgenda().deleteContacto((Contacto_I1) getFrame().getList().getSelectedValue());
				
				// Update the list of contacts
				showContacts();
			}
						
		}else{
			
			JOptionPane.showMessageDialog(
					getFrame(),
					"Selecciona un contacto a borrar",
					"Advertencia",
				    JOptionPane.WARNING_MESSAGE);
		}
	}

}

