package co.camcar.proyectorest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.camcar.proyectorest.entidad.Empleado;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
	
	private List<Empleado> empleados;
	
	@PostConstruct
	public void cargaDatos() {

		empleados = new ArrayList<>();
		
		empleados.add(new Empleado("Juan", "Díaz"));
		empleados.add(new Empleado("Ana", "López"));
		empleados.add(new Empleado("María", "Martín"));
		empleados.add(new Empleado("Antonio", "Fernández"));
	}

	@GetMapping("/empleados")
	public List<Empleado> getEmeplados(){
		return empleados;		
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado getEmeplado(@PathVariable int id){
		//comprueba si existe el empleado con su ID
		if(id >= empleados.size() || id< 0) {
			throw new EmpleadoNotFoundException("El id "+id+" no existe. El empleado no se encontro.");
		}
		return empleados.get(id);		
	}
	
	@ExceptionHandler
	public ResponseEntity<EmpleadoResponseError> manejoExcepcion(EmpleadoNotFoundException excepcion){
		
		EmpleadoResponseError error = new EmpleadoResponseError(HttpStatus.NOT_FOUND.value(), excepcion.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.ok(error);
	}
}