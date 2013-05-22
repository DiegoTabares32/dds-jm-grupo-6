package tests

import org.junit.Before;
import org.junit.Test
import org.junit.Assert.*
import estrategias.*
import interfaces.*

class Tests {
	
	private Persona personaLeGustaTodo
	private Persona personaLeGustaMismoDia
	private Persona personaLeGustaRopa
	private Persona personaLeGustaJugueteORopaCara
	private Regalo juguete
	private Regalo ropa
	
	@Before
	public void inicializar()
	{
		Date fecha = new Date()
		this.personaLeGustaTodo = new Persona(new CualquierCosa(), fecha)
		this.personaLeGustaMismoDia = new Persona(new MismoDia(), fecha)
		this.personaLeGustaRopa = new Persona(new Ropa(), fecha)
		this.personaLeGustaJugueteORopaCara = new Persona(new JugueteORopaCara(), fecha)
		this.ropa = new Regalo(140, "ropa", fecha)
		this.juguete = new Regalo(45, "juguete", fecha) 
	}
	
	@Test
	public void personaQueLeGustaTodo()
	{
		assert personaLeGustaTodo.teGusta(juguete) && personaLeGustaTodo.teGusta(ropa)
	}
	
	@Test
	public void personaQueLeGustaRopa()
	{
		assert personaLeGustaRopa.teGusta(ropa)
	}
	
	
	@Test
	public void personaQueLeGustaEnElMismoDia()
	{
		assert personaLeGustaMismoDia.teGusta(ropa)
	}
	
	@Test
	public void personaQueLeGustaJugueteORopaCara()
	{
		assert personaLeGustaJugueteORopaCara.teGusta(juguete) && personaLeGustaJugueteORopaCara.teGusta(ropa)
	}
}
