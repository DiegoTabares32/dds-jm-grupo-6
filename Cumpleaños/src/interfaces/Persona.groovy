package interfaces

import estrategias.Preferencia

class Persona {
	
	private Preferencia preferencia
	private Date fechaCumple
	
	public Persona(Preferencia unaPreferencia, Date fecha)
	{
		this.preferencia = unaPreferencia
		this.fechaCumple = fecha
	}
	
	public Date getFechaCumple()
	{
		return this.fechaCumple
	}
	
	public boolean teGusta(Regalo unRegalo)
	{
		return this.preferencia.verificarGusto(this, unRegalo)
	}
}
