package dominio

import componente.ProductoFinal

class Fabrica {

	def reservar(producto) {
		producto.reservar()
	}
}
