package componente

import dominio.Stock

class ComponenteSimple extends ProductoFinal {
	
	public ComponenteSimple(Stock stock){
		this.stock = stock
		this.puntoDePedido = 4
	}
	
	@Override
	public void reservar()
	{
		if(stock.tenes(this))
		{
			stock.componentes.remove(this)
		}
		else
		{
			stock.fabricar(this)
		}
	}
	
	public void aumentarStock()
	{
		int i
		for(i=0;i< this.puntoDePedido;i++)
		{
			stock.agregar(new ComponenteSimple(stock))
		}
	}
}
