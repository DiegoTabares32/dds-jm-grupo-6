package componente

import observadores.Observador

class ComponenteSimple extends ProductoFinal {
	
	public ComponenteSimple(){
		this.stock = 0
		this.observadores = new ArrayList<Observador>()
		this.puntoDePedido = 4
	}
	
	@Override
	public void reservar()
	{
		if(stock>0)
		{
			stock--
			this.notificarObservadores()
		}
		else
		{
			this.fabricar()
			this.notificarObservadores()
		}
	}
	
}
