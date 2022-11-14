/*Elaborar un programa que incorpore en un vector de 10 elementos
 * sus operaciones basicas:
 * insertar
 * eliminar
 * ordenar
 * buscar
 
 */
public class Caja implements ICaja{
	private int [] elementos;
	private int indice;
	
	public Caja()
	{
		elementos = new int [10];
		indice=0;
	}

	@Override
	public boolean insertar(int valor){
		if(indice > 9)
		{
			return false;
		}
		elementos[indice]=valor;
		indice++;
		return false;
	}

	@Override
	public void eliminar(int indice) {
		if(elementos[indice]!=0)
		{
			for(int x=indice; x<elementos.length-1; x++)
			{
				elementos[indice]= elementos [x+1];
				indice++;
			}
		}
		
	}

	@Override
	public void ordenar(int [] elementos) {
		boolean repetir= false;
		int a=0;
		while(repetir==false)
		{
			repetir= true;
			for (int i=0; i<elementos.length;i++)
			{
				if(elementos[i]> elementos[i+1])
				{
					a= elementos[i+1];
					elementos[i+1]= elementos[i];
					elementos[i]= a;
					repetir= false;
				}
			}
		}
		
	}

	@Override
	public boolean buscar(int valor) {
	
		return false;
	}

	@Override
	public void mostrar() {
		for(int i : elementos)
		{
			System.out.println(i);
		}
		
		/*
		 es lo mismo que el de arriba
			for (int x = 0; x<elementos.length; x++)
			{
				System.out.println(elementos[x]);
			}
		*/
		
	}
	
	
	

}
