package estrategias

import interfaces.Persona
import interfaces.Regalo

class Ropa implements Preferencia{

	@Override
	public boolean verificarGusto(Persona unaPersona, Regalo unRegalo) {
		return unRegalo.esRopa()
	}

}
