package tests

import org.junit.Before
import org.junit.Assert
import org.junit.Test;

import dominio.*
import componente.*

class Tests {
	
	private Stock stock
	private Fabrica fabrica
	private ProductoFinal productoSimple
	private ComponenteCompuesto productoCompuesto
	
	@Before
	public void inicializar()
	{
		this.fabrica = new Fabrica()
		this.stock = new Stock(this.fabrica)
		this.productoSimple = new ComponenteSimple(this.stock)
		this.productoCompuesto = new ComponenteCompuesto(this.stock)
	}
	
	@Test
	void test1()
	{
		
		assert stock.componentes.size().equals(0)	
	}
	
	@Test
	void reservarProductoSimple()
	{
		this.stock.reservar(this.productoSimple)
		assert this.stock.componentes.size().equals(4)
	}
	
	@Test
	void reservarProductoCompuesto()
	{
		this.productoCompuesto.agregarComponente(this.productoSimple)
		this.stock.reservar(this.productoCompuesto)
		assert this.stock.componentes.size().equals(4)
	}
	
	@Test
	void test3()
	{
		this.productoCompuesto.aumentarStock()
		assert stock.componentes.size() == 2
	}
}
