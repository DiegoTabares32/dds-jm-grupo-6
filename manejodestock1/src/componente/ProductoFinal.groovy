package componente

import dominio.*

abstract class ProductoFinal {

	def stock
	def puntoDePedido
	def stockMinimo
	def stockMaximo
	def observadores = []
	
	abstract reservar()

	def agregarObservador(observador) {
		observadores << observador
	}

	def fabricar() {
		aumentarStock()
	}

	def aumentarStock() {
		stock += puntoDePedido
	}

	def notificarObservadores() {
		observadores.each { it.actualizar(this) }
	}
}
