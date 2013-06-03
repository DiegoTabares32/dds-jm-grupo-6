package componente

import dominio.Stock

class ComponenteSimple extends ProductoFinal {
	
	@Override
	public void reservar(Stock stock)
	{
		if(stock.componentes.contains(this))
		{
			stock.componentes.remove(this)
		}
		else
		{
			stock.fabricar(this)
		}
	}
}
