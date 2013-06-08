package estrategia


class Jubilado extends Tipo{
	
	public Jubilado()
	{
		this.descuento = 0.15
	}
	
	@Override
	public double getDescuento(double valorBase)
	{
		return this.descuento * valorBase
	}
}
