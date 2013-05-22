package estrategias

import interfaces.Persona
import interfaces.Regalo

class MismoDia implements Preferencia{

	@Override
	public boolean verificarGusto(Persona unaPersona, Regalo unRegalo) {
		return unaPersona.getFechaCumple().equals(unRegalo.getFechaDeEntrega())
	}

}
