package observadores

class Auditoria  {

	def stockMinimoAnterior
	def logsAumentoStockMinimo = 0
	def logsDecrementoStockMinimo = 0
	def logsExcesoDeStock = 0

	Auditoria(producto) {
		stockMinimoAnterior = producto.stockMinimo
	}

	def actualizar(producto) {
		if(producto.stockMinimo < stockMinimoAnterior) {
			//Se genera un log de auditoria
			logsDecrementoStockMinimo++
		}
		if(producto.stock > producto.stockMinimo) {
			//Se loguea el hecho de que dejo de estar por debajo de su stock minimo
			logsAumentoStockMinimo++
		}
		if(producto.stock > producto.stockMaximo) {
			//Se registra el evento
			logsExcesoDeStock++
		}
	}
}
