package observadores

import componente.ProductoFinal;

class OrdenCompra implements Observador{

	private List<ProductoFinal> ordenes
	
	public OrdenCompra()
	{
		this.ordenes = new ArrayList<ProductoFinal>()	
	}
	
	@Override
	public void actualizar(ProductoFinal producto) {
		if(producto.stock < producto.stockMinimo)
		{
			//Se genera una orden de compra registrando 
			//los datos del producto y la cantidad a pedir
			this.ordenes.add(producto)
		}
		
	}

}
