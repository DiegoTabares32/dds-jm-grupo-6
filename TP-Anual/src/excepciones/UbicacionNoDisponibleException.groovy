package excepciones

class UbicacionNoDisponibleException extends RuntimeException{

	public String getMessage() {
		return "La ubicacion que solicito no esta Disponible"	
	}
}
