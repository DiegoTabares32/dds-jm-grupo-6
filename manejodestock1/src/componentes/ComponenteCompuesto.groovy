package componentes

import dominio.Stock

class ComponenteCompuesto extends Componente {
	
	private List<Componente> componentes
	
	@Override
	public void reservar(Stock stock)
	{
		for(componente in componentes)
		{
			componente.reservar(stock)
		}
	}
}
