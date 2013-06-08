package dominio

class Ubicacion {
	
	private String sector
	private int fila
	private double precioBase
	
	public Ubicacion(String sector, int fila, double precioBase)
	{
		this.sector = sector
		this.fila = fila
		this.precioBase = precioBase
	}
	
	public double getValorBase()
	{
		return precioBase
	}
}
