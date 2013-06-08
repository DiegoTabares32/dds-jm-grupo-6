package estrategia


class PersonaMenor extends Tipo{

	public PersonaMenor()
	{
		this.descuento = 0.20
	}
	
	@Override
	public double getDescuento(double valorBase) {
		if(valorBase > 100)
		{
			return valorBase * descuento
		}else
		{
			if(50 < valorBase && valorBase <= 100)
			{
				return 10
			}		
		}
	}
}
