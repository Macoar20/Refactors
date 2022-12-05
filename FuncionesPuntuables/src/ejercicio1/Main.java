
package ejercicio1;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		//Declaro las variables
		boolean esPrimo;//Boleano para indicar si es primo o no
		boolean esCapicua;//Boleano para indicar si es capicua
		int num1;//Y un número
		
		
			//Creo el escáner que utilizará el usuario
			Scanner ma = new Scanner(System.in); 
			
			//Le decimos al usuario qué tiene que hacer
			System.out.println("Introduzca un número");
		
		//El usuario introduce el número
		num1 = ma.nextInt();
		
		//LLamamos a la función
		Numeros resultado = new Numeros();
		//Los resultados de las funciones son mostrados
		System.out.println("El número es primo" + resultado.esPrimo(num1));
		System.out.println("El número es capicua" + resultado.esCapicua(num1));
		
		ma.close();
	}

}
