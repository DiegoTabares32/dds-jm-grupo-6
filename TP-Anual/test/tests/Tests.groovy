package tests

import dominio.*
import estrategia.*
import org.junit.Test
import org.junit.Before

class Tests {
	
	private Banda banda
	private Noche noche
	
	@Before
	void inicializar()
	{
		this.banda = new Banda()
		banda.categoria = 3
		this.noche = new Noche()
	}
	
	@Test
	void agregarBandaYChequearCategoria()
	{
		this.noche.agregarBanda(banda)
		assert noche.categorias.first().equals(3)
	}
	
	@Test
	void agregarBandaYChequearCategoria2()
	{
		Banda banda2 = new Banda()
		Banda banda3 = new Banda()
		banda3.categoria = 4
		banda2.categoria = 2
		this.noche.agregarBanda(banda)
		this.noche.agregarBanda(banda3)
		this.noche.agregarBanda(banda2)
		this.noche.agregarBanda(banda2)
		assert noche.categorias.equals([4,3,2])
	}
	
	@Test
	void chequearValorExtraPorBandaDeMayorCategoria()
	{
		this.noche.agregarBanda(banda)
		Banda banda2 = new Banda()
		Banda banda3 = new Banda()
		banda3.categoria = 4
		banda2.categoria = 2
		this.noche.agregarBanda(banda2)
		this.noche.agregarBanda(banda3)
		assert this.noche.getValorExtra() == 200.0
	}
	
	@Test
	void comprarEntrada()
	{
		Entrada entrada = new Entrada(new Jubilado())
		Ubicacion ubicacion = new Ubicacion("azul", 5, 32.0)
		noche.agregarBanda(banda)
		assert entrada.getPrecio(ubicacion, noche)==(127.2)	
	}
}
