package tamagotchi

import estados.Estado

class Mascota {
		
		def Estado estado
		def int felicidad = 0
		
		public Mascota(Estado unEstado)
		{
		this.estado = unEstado
		}
		
		def come()
		{
		estado.come(this)
		}
		
		def juga()
		{
		estado.juga(this)
		}
		
		boolean podesJugar()
		{
		return estado.podesJugar()
		}
		
		def int cuanContentaEstas()
		{
		return this.felicidad
		}

}
