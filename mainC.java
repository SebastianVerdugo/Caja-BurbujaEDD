
public class mainC {
	
	public static void main (String[] args){
		Caja c = new Caja();
		c.insertar(9);
		c.insertar(2);
		c.insertar(5);
		c.insertar(3);
		c.insertar(8);
		c.mostrar();
		System.out.println("------------------");
		c.eliminar(1);
		c.mostrar();
		System.out.println("Fin");
	}

}
