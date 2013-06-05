package componente

import dominio.*

public abstract class ProductoFinal {

		protected Fabrica fabrica
		protected Stock stock
		protected int puntoDePedido
		
		public void reservar(){}
		
		public void agregarComponente(ProductoFinal producto){}
		
		public void aumentarStock()
		{
			int i
			for(i=0;i < puntoDePedido;i++)
			{
				stock.agregar(new ComponenteCompuesto(stock))
			}
		}
}
