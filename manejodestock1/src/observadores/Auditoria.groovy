package observadores

import componente.ProductoFinal;

class Auditoria implements Observador{

	private int stockMinimoAnterior
	private int logsAumentoStockMinimo
	private int logsDecrementoStockMinimo
	private int logsExcesoDeStock
	
	public Auditoria(ProductoFinal producto)
	{
		this.stockMinimoAnterior = producto.stockMinimo
		this.logsAumentoStockMinimo = 0
		this.logsDecrementoStockMinimo = 0
		this.logsExcesoDeStock = 0	
	}
	
	@Override
	public void actualizar(ProductoFinal producto) {
		if(producto.stockMinimo < this.stockMinimoAnterior)
		{
			//Se genera un log de auditoria
			this.logsDecrementoStockMinimo++
		}
		if(producto.stock > producto.stockMinimo)
		{
			//Se loguea el hecho de que dejo de estar por debajo de su stock minimo
			this.logsAumentoStockMinimo++
		}
		if(producto.stock > producto.stockMaximo)
		{
			//Se registra el evento
			this.logsExcesoDeStock++
		}
	}

}
