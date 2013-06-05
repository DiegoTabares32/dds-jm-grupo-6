package dominio

import componente.ProductoFinal
import dominio.Fabrica

class Stock {
	
	Fabrica fabrica
	List<ProductoFinal> componentes 
	
	public Stock(Fabrica fabrica)
	{
		this.fabrica = fabrica
		this.componentes = new ArrayList<ProductoFinal>()
	}
	
	public reservar(ProductoFinal producto)
	{
		if (this.tenes(producto))
		{
				componentes.remove(producto)
		}
		else
		{
				producto.reservar()
		}	
	}
	
	public void fabricar(ProductoFinal producto)
	{
		fabrica.reservar(producto)
	}
	
	public boolean tenes(ProductoFinal producto)
	{
		return this.componentes.contains(producto)
	}
	
	public void agregar(ProductoFinal producto)
	{
		this.componentes.add(producto)
	}
}
