package estrategias

import interfaces.Persona
import interfaces.Regalo

class JugueteORopaCara implements Preferencia{

	@Override
	public boolean verificarGusto(Persona unaPersona, Regalo unRegalo) {
		return unRegalo.esJuguete() || (unRegalo.esRopa() && unRegalo.getValor() > 100)
	}

}
