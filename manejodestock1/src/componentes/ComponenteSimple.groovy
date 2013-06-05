package componentes

import dominio.Stock

class ComponenteSimple extends Componente {
	
	@Override
	public void reservar(Stock stock)
	{
		if(stock.componentes.contains(this))
		{
			stock.componentes.remove(this)
		}
		else
		{
			fabrica.reservar(this)
		}
	}
}
