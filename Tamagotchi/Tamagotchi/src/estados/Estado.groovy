package estados

import tamagotchi.Mascota;

public interface Estado {

	void come(Mascota mascota)
		
	void juga(Mascota mascota)
		
	boolean podesJugar()

}