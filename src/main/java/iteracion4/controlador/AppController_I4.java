package iteracion4.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppController_I4 extends iteracion3.controlador.AppController_I3 {
	
	public void startApplication(){
		super.startApplication();
		
		// Connect events
		
		getFrame().getBtnBuscarContacto().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarContacto();
			}
		});
		
	}
	
	public void buscarContacto(){
		
		System.out.println(getAgenda().findContacto("nombre").toString());
		
		BuscarController_I4 controller = new BuscarController_I4(this);
		controller.getFrame().setTitle("Bsucar contacto");
		
	}

}

