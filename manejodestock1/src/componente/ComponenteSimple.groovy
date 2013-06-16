package componente


class ComponenteSimple extends ProductoFinal {

	def reservar() {
		if(stock>0) {
			stock--
			notificarObservadores()
		}
		else {
			fabricar()
			notificarObservadores()
		}
	}
}
