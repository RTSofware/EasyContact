package iteracion3;

import iteracion3.controlador.AppController_I3;

public class App_I3 extends iteracion2.App_I2{

	public static void main(String[] args) {
		
		System.out.println( "iteraccion3" );
		
		AppController_I3 controlador = new AppController_I3();
		controlador.startApplication();
				
		System.out.println( "iteraccion3 - exito!" );
		
	}

}