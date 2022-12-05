package ejercicio1;

	import java.util.Scanner; //Importamos el java.util que utilizaremos

	public class Numeros{
	 public boolean esPrimo(int num1) {
		 boolean esPrimo=true;//booleano para indicar si es primo o no
		for (int cont=2;num1>cont;cont++) {
			if (num1%cont==0) {
				if (esPrimo==true) {
					return esPrimo;
					
				}
				else if (esPrimo==false){
					return esPrimo;
				}
		return esPrimo;
		
				}
			}
		return esPrimo;
		}


	public boolean esCapicua(int num1) {
		boolean esCapicua;
		int ayuda; //Guarda el numero 
		int reves=0; //Comprobación de su nº invertido
		int resto; //Comprobación del resto para módulos
		
		//Pregunto por el valor del numero	

		//ayuda se establece como numero/10, resto al modulo de ayuda/10 y reves al resto.
		
		  ayuda=(num1/10);
		  resto= ayuda%10;
		  reves=resto;
		
		  //Mientras ayuda sea diferente a 0 resto se fija a ayuda%10, reves a resto*10+resto y ayuda a sí misma/10
		  while(ayuda!=0) {
		   resto= ayuda%10;
		   reves=reves*10+resto;
		   ayuda= ayuda/10;
		  }
		  //Si reves es = a numero es capicua, si no, no; muestro scanner en ambos casos
		  if(reves==num1) {
			 esCapicua=false;
			  }
			 else {
			esCapicua=true;
			 }
		  return esCapicua;
	}
}	




