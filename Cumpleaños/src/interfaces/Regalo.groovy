package interfaces

class Regalo {
	
	private double valor
	private String tipo
	private Date fechaDeEntrega
	
	public Regalo(double valor, String tipo, Date fechaDeEntrega)
	{
		this.valor = valor
		this.tipo = tipo
		this.fechaDeEntrega = fechaDeEntrega	
	}
	
	public boolean esJuguete()
	{
		return this.tipo.equals("juguete")
	}
	
	public boolean esRopa()
	{
		return this.tipo.equals("ropa")
	}
	
	public double getValor()
	{
		return this.valor
	}
	
	public Date getFechaDeEntrega()
	{
		return this.fechaDeEntrega
	}
}
