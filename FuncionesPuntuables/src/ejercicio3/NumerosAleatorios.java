package ejercicio3;

public class NumerosAleatorios {

	// Creacion de la variable donde se guardaran los numeros aleatorios
	static double aleat = 0;

	static void numerosAleatorios(int num) {

		//bucle hasta que i sea igual o mayor que num
		for (int i = 0; i < num; i++) {
			// Se genera un numero aleatorio entre 0 y 1
			aleat = Math.random();
			// Se le da el número
			System.out.println(aleat);
		}

	}

	static void numerosAleatorios(int num1, int num2) {

		//bucle hasta que i sea mayor que num1
		for (int i = 0; i < num1; i++) {
			// Se genera un numero aleatorio entre 0 y num2
			aleat = Math.random() * num2;
			// Se le da el número
			System.out.println((int) aleat);
		}
	}


	static void numerosAleatorios(int rep, int max, int min) {

		//bucle hasta que i sea mayor que rep
		for (int i = 0; i < rep; i++) {
			// Se genera un numero aleatorio entre el min y el max
			aleat = Math.random() * ((max + 1) - min) + min;
			// Se le da el número
			System.out.println(aleat);
		}
	}

}