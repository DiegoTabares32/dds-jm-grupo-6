package dominio

import componentes.Componente

class Empresa {
	
	Stock stock
	
	public Empresa (Stock unStock)
	{
		this.stock = unStock
	}
	
	public traer(Componente producto)
	{
			stock.reservar(producto)
	}
	
	

}
