package estados

import tamagotchi.Mascota;

class Hambrienta implements Estado {

	@Override
	public void come(Mascota mascota) {
		mascota.setEstado(new Contento())
	}
	
	@Override
	public void juga(Mascota mascota) {
	// NO HACE NADA
	}
	
	@Override
	public boolean podesJugar() {
		return false;
	}
	
}