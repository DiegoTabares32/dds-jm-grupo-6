package dominio

import estrategia.Tipo
import excepciones.* 

class Entrada {
	
	private Persona comprador
	
	public double getPrecio(Ubicacion ubicacion, Noche noche, Persona persona)
	{
		return ubicacion.getValorBase() + noche.getValorExtra() - persona.getDescuento(ubicacion.getValorBase())
	}
	
	public void comprar(Ubicacion ubicacion, Noche noche, Persona persona)
	{
		noche.comprarUbicacion(ubicacion)
		this.comprador = persona			
	}
}
