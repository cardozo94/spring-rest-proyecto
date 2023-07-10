package co.camcar.proyectorest.rest;

/**
 * Excepción personalizada
 * 
 * @author cristian.cardozo
 *
 */
public class EmpleadoNotFoundException extends RuntimeException{

	public EmpleadoNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoNotFoundException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
}
