package observadores

class EnviarMail {

	def unidadesRetiradas
	def stockInicial
	def mailsEnviados = 0

	EnviarMail(producto, unidades) {
		unidadesRetiradas = unidades
		stockInicial = producto.stock
	}

	def actualizar(producto) {
		if((producto.stock - stockInicial) >= unidadesRetiradas) {
			//Se envia el mail con la informacion correspondiente
			mailsEnviados++
		}
	}
}
