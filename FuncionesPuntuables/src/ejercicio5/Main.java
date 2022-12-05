package ejercicio5;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		//Creamos el escáner que usaremos más tarde
			Scanner ma = new Scanner(System.in); 
			
			//Le decimos al usuario que introduzca un número
			System.out.println("Introduzca un número");
			
			//El usuario lo introduce
			FuncionesRecursivas.a=ma.nextDouble();
			
			//Le decimos al usuario que introduzca otro número
			System.out.println("Introduzca otro número");
			
			//El usuario introduce otro número
			FuncionesRecursivas.n=ma.nextInt();
			
			//Le pedimos al usuario un último número
			System.out.println("Introduzca otro número más");
			
			//Lo introduce
			FuncionesRecursivas.numero=ma.nextInt();
			
			//LLamamos a la función
		FuncionesRecursivas resultado = new FuncionesRecursivas();
		
		//Le damos todos los resultados
		System.out.println("La suma de el primer número más sus anteriores es " + resultado.sumatorio());
		System.out.println("La potencia es " + resultado.potencia());
		System.out.println("El fibonacci es " + FuncionesRecursivas.fibonacci());
		
		//Cerramos el escáner
		ma.close();
	}
}