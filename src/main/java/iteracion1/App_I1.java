package iteracion1;

import iteracion1.controlador.AppController_I1;



public class App_I1 {

	public static void main(String[] args) {
		
		System.out.println( "iteraccion1" );
		
		AppController_I1 controlador = new AppController_I1();
		controlador.startApplication();
				
		System.out.println( "iteraccion1 - exito!" );
		
	}

}
