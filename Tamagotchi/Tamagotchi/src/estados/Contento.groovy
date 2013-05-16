package estados

import tamagotchi.Mascota

class Contento implements Estado{

	@Override
	public void come(Mascota mascota) {
		mascota.felicidad++
	}
	
	@Override
	public void juga(Mascota mascota) {
		mascota.felicidad += 2
	}
	
	@Override
	public boolean podesJugar() {
		return true
	}

}