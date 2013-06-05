package dominio

import componente.ProductoFinal

class Empresa {
	
	Stock stock
	
	public Empresa (Stock unStock)
	{
		this.stock = unStock
	}
	
	public traer(ProductoFinal producto)
	{
			stock.reservar(producto)
	}
	
	

}
