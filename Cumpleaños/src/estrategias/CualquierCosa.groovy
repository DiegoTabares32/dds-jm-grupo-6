package estrategias

import interfaces.Persona
import interfaces.Regalo

class CualquierCosa implements Preferencia{

	@Override
	public boolean verificarGusto(Persona unaPersona, Regalo unRegalo) {
		return true
	}

}
