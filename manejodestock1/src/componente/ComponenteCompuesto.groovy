package componente

import dominio.Stock

class ComponenteCompuesto extends ProductoFinal {
	
	private List<ProductoFinal> componentes
	
	public ComponenteCompuesto(Stock stock)
	{
		this.stock = stock
		this.puntoDePedido = 2
		this.componentes = new ArrayList<ProductoFinal>()
	}
	
	public void agregarComponente(ProductoFinal componente)
	{
		this.componentes.add(componente)
	}
	
	@Override
	public void reservar()
	{
		for(componente in componentes)
		{
			componente.reservar()
		}
	}
	
}
