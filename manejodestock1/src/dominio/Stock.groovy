package dominio

import componente.ProductoFinal

class Stock {
	
	List<ProductoFinal> componentes
	
	public reservar(producto)
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
