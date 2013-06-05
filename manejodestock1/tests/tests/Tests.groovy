package tests

import org.junit.Before
import org.junit.Assert
import org.junit.Test;

import dominio.*
import componente.*

class Tests {
	
	private Fabrica fabrica
	private ProductoFinal productoSimple
	private ComponenteCompuesto productoCompuesto
	
	@Before
	public void inicializar()
	{
		this.fabrica = new Fabrica()
		this.productoSimple = new ComponenteSimple()
		this.productoCompuesto = new ComponenteCompuesto()
	}
		
	@Test
	void reservarProductoSimple()
	{
		this.fabrica.reservar(this.productoSimple)
		assert this.productoSimple.stock.equals(4)
	}
	
	@Test
	void reservarProductoCompuesto()
	{
		this.productoCompuesto.agregarComponente(this.productoSimple)
		this.fabrica.reservar(this.productoCompuesto)
		assert this.productoCompuesto.stock.equals(2) && this.productoSimple.stock.equals(4)
	}
	
}
