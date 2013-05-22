package estrategias

import interfaces.Persona
import interfaces.Regalo

interface Preferencia {

	boolean verificarGusto(Persona unaPersona, Regalo unRegalo)
}
