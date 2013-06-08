package dominio

class Planificacion {
	
	List<Noche> noches = new ArrayList<Noche>()
	List<Ubicacion> ubicaciones = new ArrayList<Ubicacion>()
	
	public void cargarUbicaciones(List<Ubicacion> ubicaciones)
	{
		this.ubicaciones = ubicaciones
	}
	
	public void cargarNoche(Noche noche)
	{
		noche.setUbicaciones(this.ubicaciones)
		this.noches.add(noche)	
	}
		
	public List<Ubicacion> buscarEntradasParaNoche(Noche noche)
	{
		if(noches.contains(noche))
		{
			return noche.getUbicacionesDisponibles()		
		}
	}
	
	public void comprarEntrada(Noche noche, Ubicacion ubicacion)
	{
		noche.comprarUbicacion(ubicacion)
	}
}
