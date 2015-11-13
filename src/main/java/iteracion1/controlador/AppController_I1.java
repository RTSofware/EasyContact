package iteracion1.controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;

import iteracion1.controlador.ContactoController_I1;
import iteracion1.dominio.Agenda_I1;
import iteracion1.dominio.Contacto_I1;
import iteracion1.presentacion.AppUI_I1;

public class AppController_I1 {
	
	private Agenda_I1 agenda;
	private AppUI_I1 frame;
	
	public void startApplication(){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setAgenda(new Agenda_I1());

		setFrame(new AppUI_I1(this));
		
		 // make the frame half the height and width
		getFrame().setSize(screenSize.width/2, screenSize.height/2);
		
		// center the JFrame on screen
		getFrame().setLocationRelativeTo(null);
		
		getFrame().setVisible(true);
		
		// Connect events
		
		getFrame().getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		getFrame().getBtnAgregarContacto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addContacto();
			}
		});
		
		getFrame().getList().addMouseListener(new ListMouseListener());
		
		
		// Show the list of contacts
		showContacts();
	}
	
	public void showContacts(){
		
		getFrame().getList().setListData(getAgenda().getAllContacto().toArray());
	}
	

	
	public void showContacto(Contacto_I1 contacto){
		
		ContactoController_I1 contactoController_I1 = new ContactoController_I1(this);
		contactoController_I1.getFrame().setTitle("Ver contacto");
		contactoController_I1.setContacto(contacto);
		contactoController_I1.populateContact();
		contactoController_I1.setEditable(false);
		
		// Events
		contactoController_I1.connectEventCancelar();
	}
	
	public void close(){
		System.exit(0);
	}
	
	public void addContacto(){
		ContactoController_I1 contactoController_I1 = new ContactoController_I1(this);
		contactoController_I1.getFrame().setTitle("Añadir contacto");
		
		// Events
		contactoController_I1.connectEventCancelar();
		contactoController_I1.connectEventGuardar();
	}

	public Agenda_I1 getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda_I1 agenda) {
		this.agenda = agenda;
	}

	public AppUI_I1 getFrame() {
		return frame;
	}

	public void setFrame(AppUI_I1 frame) {
		this.frame = frame;
	}
	
	private class ListMouseListener extends MouseAdapter{
		
		public void mouseClicked(MouseEvent evt) {
			
			JList<?> list = (JList<?>)evt.getSource();
			
			// Double-click detected
			if (evt.getClickCount() == 2) {
				//int index = list.locationToIndex(evt.getPoint());
				showContacto((Contacto_I1) list.getSelectedValue());				
			}
		}
	}
}
