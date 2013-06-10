package dominio

import estrategia.Tipo

class Persona {
	
	private Tipo tipo
	
	public Persona(Tipo tipo)
	{
		this.tipo = tipo
	}
	
	public double getDescuento(double valorBase)
	{
		return this.tipo.getDescuento(valorBase)
	}
}
