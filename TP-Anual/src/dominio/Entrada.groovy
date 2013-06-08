package dominio

import estrategia.Tipo;

class Entrada {
	
	Tipo tipo
	
	public Entrada(Tipo tipo)
	{
		this.tipo = tipo	
	}
	
	public double getPrecio(Ubicacion ubicacion, Noche noche)
	{
		return ubicacion.getValorBase() + noche.getValorExtra() - tipo.getDescuento(ubicacion.getValorBase())
	}
}
