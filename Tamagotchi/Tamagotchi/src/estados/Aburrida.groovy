package estados

import tamagotchi.Mascota;

class Aburrida implements Estado {

	def antes

	public Aburrida()
	{
		def hora = new Date()
		this.antes = hora.getHours()*60+hora.getMinutes()
	}
	
	@Override
	public void come(Mascota mascota) {
		def ahora = this.tiempoActual()
		def minutosTranscurridos = this.minutosEntre(ahora, this.antes)
		if(minutosTranscurridos > 80)
		{
			mascota.setEstado(new Contento())
		}
	}
	
	@Override
	public void juga(Mascota mascota) {
		mascota.setEstado(new Contento())
	}
	
	@Override
	public boolean podesJugar() {
		return true
	}
	
	private def minutosEntre(def ahora, def antes)
	{
		return (ahora - antes)
	}
	
	private def tiempoActual()
	{
		def tiempo = new Date()
		return (tiempo.getHours()*60+tiempo.getMinutes())
	
	}

}