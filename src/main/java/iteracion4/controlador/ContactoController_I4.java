package iteracion4.controlador;

import iteracion1.controlador.AppController_I1;

public class ContactoController_I4 extends iteracion1.controlador.ContactoController_I1{

	public ContactoController_I4(AppController_I1 appController) {
		super(appController);
		// TODO Auto-generated constructor stub
	}
	
	public ContactoController_I4(BuscarController_I4 buscarController){
		super(buscarController.getAppController());
	}

}
