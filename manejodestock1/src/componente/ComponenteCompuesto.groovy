package componente

import observadores.*

class ComponenteCompuesto extends ProductoFinal {

	private List<ProductoFinal> componentes

	public ComponenteCompuesto() {
		this.stock = 0
		this.puntoDePedido = 2
		this.observadores = new ArrayList<Observador>()
		this.componentes = new ArrayList<ProductoFinal>()
	}

	public void agregarComponente(ProductoFinal componente) {
		this.componentes.add(componente)
	}

	@Override
	public void reservar() {
		if(stock>0) {
			stock--
			this.notificarObservadores()
		}else {
			for(componente in componentes) {
				componente.reservar()
			}

			this.aumentarStock()
		}
	}
}
