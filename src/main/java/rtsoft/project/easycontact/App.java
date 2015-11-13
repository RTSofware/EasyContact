package rtsoft.project.easycontact;

import iteracion4.controlador.AppController_I4;

public class App extends iteracion4.App_I4{

	public static void main(String[] args) {
		
		System.out.println( "EasyContact" );
		
		AppController_I4 controlador = new AppController_I4();
		controlador.startApplication();
				
		System.out.println( "EasyContact - exito!" );
		
	}
}
