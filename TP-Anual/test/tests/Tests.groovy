package tests

import dominio.*
import estrategia.*
import org.junit.Test
import org.junit.Before
import excepciones.*

class Tests {
	
	private Banda banda
	private Noche noche
	private Planificacion planificacion
	private Persona persona
	private Entrada entrada
	
	@Before
	void inicializar()
	{
		this.banda = new Banda()
		banda.categoria = 3
		this.noche = new Noche()
		this.planificacion = new Planificacion()
		this.entrada = new Entrada()
		this.persona = new Persona(new Jubilado())
		this.planificacion = new Planificacion()
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
		Ubicacion ubicacion = new Ubicacion("azul", 5, 32.0)
		noche.agregarBanda(banda)
		assert entrada.getPrecio(ubicacion, noche, persona)==(127.2)	
	}
	
	@Test
	void personaCompraEntrada()
	{
		noche.agregarBanda(banda)
		planificacion.cargarUbicaciones([new Ubicacion("azul", 5, 32.0), new Ubicacion("azul", 6, 70.0)])
		planificacion.cargarNoche(noche)
		List<Ubicacion> ubis = planificacion.buscarUbicacionesParaNoche(noche)
		entrada.comprar(ubis.first(), noche, persona)
		assert planificacion.buscarUbicacionesParaNoche(noche).size().equals(1)
	}
	
	@Test
	void notificarUbicacionNoDisponilbeAlComprar()
	{
		noche.agregarBanda(banda)
		Ubicacion ubi1 = new Ubicacion("azul", 5, 32.0)
		Ubicacion ubi2 = new Ubicacion("azul", 6, 70.0)
		planificacion.cargarUbicaciones([ubi1, ubi2 ])
		planificacion.cargarNoche(noche)
		// Compra la ubi1
		entrada.comprar(ubi1, noche, persona)
		try
		{
			//Al querer comprar la ubi1 de nuevo, se lanza la excpecion
			entrada.comprar(ubi1, noche, persona)			
		}
		catch(UbicacionNoDisponibleException e)
		{
			assert planificacion.buscarUbicacionesParaNoche(noche).size().equals(1)
		}
	}
}
