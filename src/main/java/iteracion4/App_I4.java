package iteracion4;

import iteracion4.controlador.AppController_I4;

public class App_I4 extends iteracion3.App_I3{

	public static void main(String[] args) {
		
		System.out.println( "iteraccion4" );
		
		AppController_I4 controlador = new AppController_I4();
		controlador.startApplication();
				
		System.out.println( "iteraccion4 - exito!" );
		
	}

}