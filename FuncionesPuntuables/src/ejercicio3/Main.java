package ejercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Variable para la primera función
		int num;
	
		//Variables para la segunda función
		int num1;
		int num2;
		
		//Variable para la tercera función
		int max, min, rep;

		//Creamos el escáner que usaremos más tarde
		Scanner ma = new Scanner(System.in); 

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero: ");
		num = ma.nextInt(); // Se guarda el valor en la variable

		NumerosAleatorios.numerosAleatorios(num); //Se llama a la funcion

		// Se solicita al usuario que introduzca dos numeros
		System.out.println("Introduzca dos numero: ");
		num1 = ma.nextInt(); // Se guarda el valor en la variable
		num2 = ma.nextInt(); // Se guarda el valor en la variable
		NumerosAleatorios.numerosAleatorios(num1, num2); //Se llama a la funcion 

		// Se solicita al usuario que introduzca tres numeros
		System.out.println("Introduzca repeticiones, max y min");
		rep = ma.nextInt(); // Se guarda el valor en la variable 
		max = ma.nextInt(); // Se guarda el valor en la variable
		min = ma.nextInt(); // Se guarda el valor en la variable
		NumerosAleatorios.numerosAleatorios(rep, max, min); //Se llama a la funcion  

		ma.close(); //Se cierra el objeto creado
	}

}