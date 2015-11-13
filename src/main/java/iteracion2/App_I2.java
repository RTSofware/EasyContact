package iteracion2;

import iteracion2.controlador.AppController_I2;

public class App_I2 extends iteracion1.App_I1{

	public static void main(String[] args) {
		
		System.out.println( "iteraccion2" );
		
		AppController_I2 controlador = new AppController_I2();
		controlador.startApplication();
				
		System.out.println( "iteraccion2 - exito!" );
		
	}

}
