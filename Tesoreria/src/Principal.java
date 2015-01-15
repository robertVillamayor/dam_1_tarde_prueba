
public class Principal {

	public static void main(String[] args) {
		//variables
		int miDinero=0;
		int dineroQuePierdo=0;
		int total = 0;
		int ingresos[]={10,30,5,15,25};
		int gastos[]={-45,-60,-70};
		
		//codigo
		
		/*calculo todos los ingresos*/
		for(int i=0; i<ingresos.length;i++)
		{
			miDinero+=ingresos[i];
		}
		
		/*calculo todos los gastos*/
		for(int i=0; i<gastos.length;i++)
		{
			dineroQuePierdo+=gastos[i];
		}
		
		/*calculo el total*/
		total=miDinero+dineroQuePierdo;
		
		//por pantalla
		System.out.println("Total ingresos: "+ miDinero);
		System.out.println("Total gastos: "+ dineroQuePierdo);
		System.out.println("Total neto: "+ total);

	}

}
