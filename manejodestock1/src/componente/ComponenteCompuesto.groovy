package componente

import observadores.*

class ComponenteCompuesto extends ProductoFinal {

	def componentes = []

	def agregarComponente(componente) {
		this.componentes << componente
	}

	def reservar() {
		if(stock>0) {
			stock--
			this.notificarObservadores()
		}else {
			componentes.each { it.reservar() }
			this.aumentarStock()
		}
	}
}
