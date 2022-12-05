package ejercicio5;

public class FuncionesRecursivas{
	
//Creamos las variables
static double a;
static int n;
static int numero;
static double potencia;
static int fibonacci;


//Función que hará referencia al sumatorio
public double sumatorio() {
	
		double sumatorio;
		for (int nu=numero;nu<=1;nu--) {
			numero=(nu-1)+numero;
		}
				return numero;
}

//Función que hará referencia a un número elevado a la potencia que queramos
public double potencia() {
	
	double potencia;
		potencia=Math.pow(a, n);
		return potencia;
	}

//Creamos la función de fibonacci
public static int fibonacci(){
		double pos=a;
		if (pos<=1) {
			fibonacci=1;
		} else {
			
			//Mediante este for haremos que se vayan añadiendo números según el funcionamiento de la función de fibonacci
			for (int num=0;num<a;num++) {
			fibonacci=(n-1)+(n-2);
			}
		}
		return fibonacci;
}

}