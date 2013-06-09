package dominio

class Ubicacion {
	
	private String sector
	private int fila
	private double precioBase
	private boolean estaComprada
	
	public Ubicacion(String sector, int fila, double precioBase)
	{
		this.sector = sector
		this.fila = fila
		this.precioBase = precioBase
		this.estaComprada = false
	}
	
	public double getValorBase()
	{
		return precioBase
	}
	
	public boolean estaComprada(){
		return estaComprada
	}
}