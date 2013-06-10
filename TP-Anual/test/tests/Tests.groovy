package tests

import dominio.*
import estrategia.*
import org.junit.Test
import org.junit.Before

class Tests {
	
	private Banda banda
	private Noche noche
	private Planificacion planificacion
	
	@Before
	void inicializar()
	{
		this.banda = new Banda()
		banda.categoriaBanda = 3
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
		banda3.categoriaBanda = 4
		banda2.categoriaBanda = 2
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
		banda3.categoriaBanda = 4
		banda2.categoriaBanda = 2
		this.noche.agregarBanda(banda2)
		this.noche.agregarBanda(banda3)
		assert this.noche.getValorExtra() == 200.0
	}
	
	@Test
	void calcularPrecio()
	{
		Entrada entrada = new Entrada(new Jubilado())
		Ubicacion ubicacion = new Ubicacion("azul", 5, 32.0)
		noche.agregarBanda(banda)
		assert entrada.getPrecio(ubicacion, noche)==(127.2)	
	}
	
	@Test
	void sePudoComprarEntrada(){
		Entrada entrada = new Entrada(new PersonaMenor())
		this.planificacion = new Planificacion()
		Ubicacion ubicacion = new Ubicacion("naranja", 7, 50.0)
		this.noche.ubicacionesNoche.add(ubicacion)
		planificacion.comprarEntrada(noche, ubicacion)
		assert(noche.ubicacionesNoche.size)==0
		
	}
	
	@Test
	void noSePudoComprarEntrada(){
		Entrada entrada = new Entrada(new PersonaMenor())
		this.planificacion = new Planificacion()
		Ubicacion ubicacion = new Ubicacion("naranja", 7, 50.0)
		Ubicacion ubicacion2 = new Ubicacion("verde", 6, 25.0)
		this.noche.ubicacionesNoche.add(ubicacion)
		planificacion.comprarEntrada(noche, ubicacion2)
		assert(noche.ubicacionesNoche.size)==1
	}
}
