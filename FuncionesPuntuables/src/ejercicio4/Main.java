package ejercicio4;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
			
		//Creamos el escáner que le permitirá al usuario introducir valores
			Scanner ma = new Scanner(System.in); 
			
			//Le decimos al usuario que tiene que hacer
			System.out.println("Introduzca un número");
			
			//El usuario introduce el primer valor
			Operaciones.num1=ma.nextDouble();
			
			//Le decimos al usuario que introduzca otro número
			System.out.println("Introduzca otro número");
			
			//El usuario introduce otro número
			Operaciones.num2=ma.nextDouble();
			
			//LLamamos a las funciones y le mostramos los resultados
		Operaciones resultado = new Operaciones();
		System.out.println("La suma es " + resultado.suma());
		System.out.println("El resta es " + resultado.resta());
		System.out.println("La multiplicacion es " + resultado.multiplicacion());
		System.out.println("El division es " + resultado.division());
	
	//Cerramos el escáner
	ma.close();
		
	}
}