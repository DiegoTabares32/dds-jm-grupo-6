package tests;

import tamagotchi.Mascota;
import estados.*

import org.junit.Before;
import org.junit.Test
import org.junit.Assert.*

class Tests{
	
	private Mascota mascota
	
	@Before
	void inicializar(){
		this.mascota = new Mascota(new Contento())
	}
	
	@Test
	void comeEstandoContentaYSuFelicidadAumenta(){
		def felicidadAnterior = mascota.cuanContentaEstas()
		//Ahora come y por lo tanto su nivel de felicidad debió aumentar en una unidad
		mascota.come()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(1)
	}
	
	@Test
	void comeEstandoHambrientaYSePoneConteta()
	{
		mascota.setEstado(new Hambrienta())
		def felicidadAnterior = mascota.cuanContentaEstas()
		//Ahora come y se pone contenta pero su nivel de felicidad no cambia
		mascota.come()
		//Esta Contenta por lo tanto si come deberia sumar un punto de Felicidad
		mascota.come()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(1)
	}
	
	@Test
	void comeEstandoAburridaHace80MinutosOMenosYNoCambiaNada()
	{
	//Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se	pone contenta.
		mascota.setEstado(new Aburrida())		
		def felicidadAnterior = mascota.cuanContentaEstas()
		mascota.come()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(0)
	}
	
	@Test
	void juegaEstandoContentaYSuFelicidaAumentaEnDosUnidades()
	{
		def felicidadAnterior = mascota.cuanContentaEstas()
		//Al jugar estando Contenta, su nivel de felicidad deberia incrementarse en dos	unidades
		mascota.juga()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(2)
	}
	
	@Test
	void juegaEstandoAburridaYSePoneContenta()
	{
		mascota.setEstado(new Aburrida())
		def felicidadAnterior = mascota.cuanContentaEstas()
		//Al estar Aburrida, se pone Contenta cuando juega pero su nivel de Felicidad no cambia
		mascota.juga()
		//Si ahora juega estando contenta, su nivel de Felicidad debio subir dos puntos
		mascota.juga()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(2)
	}
	
	@Test
	void juegaEstandoHambrientaYNoPasaNada()
	{
		mascota.setEstado(new Hambrienta())
		def felicidadAnterior = mascota.cuanContentaEstas()
		mascota.juga()
		assert (mascota.cuanContentaEstas()-felicidadAnterior).equals(0)
	}
	
	@Test
	void estandoContentaAlPreguntarleSiPuedeJugarDiceQueSi()
	{
		assert mascota.podesJugar()
	}
	
	@Test
	void estandoAburridaAlPreguntarleSiPuedeJugarDiceQueSi()
	{
		mascota.setEstado(new Aburrida())
		assert mascota.podesJugar()
	}
	
	@Test
	void estandoHambrientaAlPreguntarleSiPuedeJugarDiceQueNo()
	{
		mascota.setEstado(new Hambrienta())
		assert !mascota.podesJugar()
	}

}