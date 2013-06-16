package observadores

class OrdenCompra {

	def ordenes = []

	def actualizar(producto) {
		if(producto.stock < producto.stockMinimo) {
			//Se genera una orden de compra registrando
			//los datos del producto y la cantidad a pedir
			ordenes << producto
		}
	}
}
