package dominio

import componente.ProductoFinal

class Stock {
	
	Fabrica fabrica
	List<ProductoFinal> componentes
	
	public Stock(Fabrica fabrica)
	{
		this.fabrica = fabrica
	}
	
	public reservar(ProductoFinal producto)
	{
		if (componentes.contains(producto))
		{
				componentes.remove(producto)
		}
		else
		{
				producto.reservar(this)
		}	
	}
	
	public void fabricar(ProductoFinal producto)
	{
		fabrica.reservar(producto)
	}

}
