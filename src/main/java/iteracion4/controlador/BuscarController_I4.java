package iteracion4.controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;

//import iteracion1.controlador.AppController_I1.ListMouseListener;
import iteracion1.dominio.Contacto_I1;
import iteracion4.presentacion.BuscarUI_I4;

public class BuscarController_I4 {
	
	private BuscarUI_I4 frame;
	private AppController_I4 appController;
	
	public BuscarController_I4(AppController_I4 appController){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setAppController(appController);
		setFrame(new BuscarUI_I4(this));
		
		 // make the frame a quarter the height and half width
		getFrame().setSize(screenSize.width/4, screenSize.height/2);
		
		// center the JFrame on screen
		getFrame().setLocationRelativeTo(null);
		getFrame().setVisible(true);
		
		// connect events
		
		getFrame().getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		
		getFrame().getBtnCerrar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		getFrame().getList().addMouseListener(new ListMouseListener());
	}
	
	public void search(){
		
		String searchText = getFrame().getSearchField().getText();
		
		if (!searchText.isEmpty()){
			getFrame().getList().setListData(
					getAppController().getAgenda().findContacto(searchText).toArray());
		}
	}
	
	public void showContacto(Contacto_I1 contacto){
		
		ContactoController_I4 contactoController_I1 = new ContactoController_I4(this);
		contactoController_I1.getFrame().setTitle("Ver contacto");
		contactoController_I1.setContacto(contacto);
		contactoController_I1.populateContact();
		contactoController_I1.setEditable(false);
		
		// Events
		contactoController_I1.connectEventCancelar();
	}
	
	public void close(){
		getFrame().dispose();
	}

	public BuscarUI_I4 getFrame() {
		return frame;
	}

	public void setFrame(BuscarUI_I4 frame) {
		this.frame = frame;
	}

	public AppController_I4 getAppController() {
		return appController;
	}

	public void setAppController(AppController_I4 appController) {
		this.appController = appController;
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
