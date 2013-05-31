package dominio

import componente.ProductoFinal

class Stock {
	
	List<ProductoFinal> componentes
	
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
	

}
