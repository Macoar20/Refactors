package notas; 

import java.util.Scanner;

public class ejercicio2 {
	
	public static final int NOTA_MAXIMA = 10;
	private double max = 0; 
	private double min = NOTA_MAXIMA; 
	private static double media = 0; 

public static void main(String[] args) {
	// Variable para guardar el nombre del alumno
	String nombreAlumno;

	// Variables para guardar los distintos tipos de notas
	int notaPractica, notaProblemas, notaTeoria;

	// Creamos constantes para las ponderaciones
	final double PORCENTAJE_PRACTICA = 0.1;
	final double PORCENTAJE_PROBLEMAS = 0.5;
	final double PORCENTAJE_TEORIA = 0.4;

	// Variable donde guardaremos la nota final
	double notaFinal;

	// Opción para el menú
	int opcion;

	// Creamos el Scanner
	Scanner leer = new Scanner(System.in);

	while (true) {
		System.out.println("Introduzca el nombre del alumno");
		nombreAlumno = leer.next();

		if (nombreAlumno.equals("0")) {
			break;
		}

		System.out.println("Introduzca la nota de la práctica");
		notaPractica = leer.nextInt();
		if (notaPractica < 0 || notaPractica > NOTA_MAXIMA) {
			System.out.println("ERROR: alguna de las notas introducidas no es correcta");
			continue;
		}
		System.out.println("Introduzca la nota de problemas");
		notaProblemas = leer.nextInt();
		if (notaProblemas < 0 || notaProblemas > NOTA_MAXIMA) {
			System.out.println("ERROR: alguna de las notas introducidas no es correcta");
			continue;
		}
		System.out.println("Introduzca la nota de teoría");
		notaTeoria = leer.nextInt();
		if (notaTeoria < 0 || notaTeoria > NOTA_MAXIMA) {
			System.out.println("ERROR: alguna de las notas introducidas no es correcta");
			continue;
		}
		double mediaPractica = notaPractica * PORCENTAJE_PRACTICA;
		double mediaProblemas = notaProblemas * PORCENTAJE_PROBLEMAS;
		double mediaTeoria = notaTeoria * PORCENTAJE_TEORIA;
		notaFinal = mediaPractica + media;
				
				
	
	}
}
}