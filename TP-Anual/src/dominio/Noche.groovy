package dominio

import dominio.Banda
import java.awt.TexturePaintContext.Int

class Noche {
	
	private List<Banda> bandas = new ArrayList<Banda>()
	private List<Byte> categorias = new ArrayList<Byte>()
	 
	public void agregarBanda(Banda unaBanda)
	{
		this.bandas.add(unaBanda)
		this.agregarCategoria(unaBanda.categoria)
	}
	
	public double getValorExtra()
	{
		def categoria = this.categorias.first()
		switch(categoria)
		{
			case 2: return 50.0
					break
			case 3: return 100.0
					break
			case 4: return 200.0
					break
			default: return 0.0
					break
		}
			
	}	
	
	public void agregarCategoria(int categoria)
	{
		if(!categorias.contains(categoria))
		{
			if(categorias.size().equals(0))
			{
				categorias.add(categoria)
			}else
			{
				int i
				for(i=0;i<categorias.size();i++)
				{
					if(categoria > categorias.get(i))
					{
						categorias.add(i, categoria)
						return
					}
				}
				categorias.add(categoria)
			}	
		}
	}
}
