package dominio

import componentes.Componente

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
				
				//producto.notificar(this)
		}
		else
		{
				producto.reservar(this)
		}	
	}

	public void fabricar(Componente producto)
	{
		fabrica.reservar(producto)
	}
	
	//cuando ingresa stock producto.notificar(this)
	//no se bien donde ubicarlo
}
