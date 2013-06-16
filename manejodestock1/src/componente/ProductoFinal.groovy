package componente

import dominio.*
import observadores.Observador

public abstract class ProductoFinal {

	protected int stock
	protected int puntoDePedido
	protected int stockMinimo
	protected int stockMaximo
	protected List<Observador> observadores

	public void reservar(){

	}

	public void agregarComponente(ProductoFinal producto){

	}

	public void agregarObservador(Observador observador) {
		this.observadores.add(observador)
	}

	public void fabricar() {
		this.aumentarStock()
	}

	public void aumentarStock() {
		this.stock += this.puntoDePedido
	}

	public void notificarObservadores() {
		for(observador in this.observadores) {
			observador.actualizar(this)
		}
	}
}
