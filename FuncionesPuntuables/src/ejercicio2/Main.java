package ejercicio2;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		//Creamos las variables para el volumen y superficie
		double volumen;//Variable del volumen
		double superficie;//Variable de la superficie
			
			//Creamos el escáner que usaremos más tarde
			Scanner ma = new Scanner(System.in); 
			
			//Le decimos al usuario lo que tiene que hacer
			System.out.println("Introduzca el radio de la esfera");
			
			//El usuario introduce el valor
			Esfera.radio=ma.nextDouble();
			
			//Llamamos a las funciones
		Esfera resultado = new Esfera();
		
		//Le damos los resultados de ambas operaciones diciendole lo que es cada una
		System.out.println("La superficie es " + resultado.superficie());
		System.out.println("El volumen es " + resultado.volumen());
		
		ma.close();
	}
}