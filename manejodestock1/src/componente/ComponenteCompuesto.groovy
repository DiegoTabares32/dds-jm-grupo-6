package componente

import dominio.Stock

class ComponenteCompuesto extends ProductoFinal {
	
	private List<ProductoFinal> componentes
	
	@Override
	public void reservar(Stock stock)
	{
		for(componente in componentes)
		{
			componente.reservar(stock)
		}
	}
}
