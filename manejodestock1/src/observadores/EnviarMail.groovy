package observadores

import componente.ProductoFinal;

class EnviarMail implements Observador{

	private int unidadesRetiradas
	private int stockInicial
	private int mailsEnviados

	public EnviarMail(ProductoFinal producto, int unidades) {
		this.unidadesRetiradas = unidades
		this.mailsEnviados = 0
		this.stockInicial = producto.stock
	}

	@Override
	public void actualizar(ProductoFinal producto) {
		if((producto.stock - this.stockInicial) >= unidadesRetiradas) {
			//Se envia el mail con la informacion correspondiente
			this.mailsEnviados++
		}
	}
}
