package tests

import org.junit.Before
import org.junit.Assert
import org.junit.Test;

import dominio.*
import componente.*

class Tests {

	def fabrica
	def productoSimple
	def productoCompuesto

	@Before
	void inicializar() {
		fabrica = new Fabrica()
		productoSimple = new ComponenteSimple(stock: 0, puntoDePedido: 4)
		productoCompuesto = new ComponenteCompuesto(stock: 0, puntoDePedido: 2)
	}

	@Test
	void reservarProductoSimple() {
		fabrica.reservar(productoSimple)
		assert this.productoSimple.stock.equals(4)
	}

	@Test
	void reservarProductoCompuesto() {
		productoCompuesto.agregarComponente(productoSimple)
		fabrica.reservar(productoCompuesto)
		assert this.productoCompuesto.stock.equals(2) 
		assert this.productoSimple.stock.equals(4)
	}
}
