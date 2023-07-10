package co.camcar.proyectorest.rest;
/**
 * Clase personalizada de error
 * 
 * @author cristian.cardozo
 *
 */
public class EmpleadoResponseError {

	private int estado;
	private String mensaje;
	private Long timestamp;
	
	public EmpleadoResponseError() {
		super();
	}

	public EmpleadoResponseError(int estado, String mensaje, Long timestamp) {
		super();
		this.estado = estado;
		this.mensaje = mensaje;
		this.timestamp = timestamp;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}