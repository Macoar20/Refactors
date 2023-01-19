package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	    private static final String MENSAJE = "Número de divisores: ";
	    private Scanner lectura;

		    public static void main(String[] args) {
		        int numeroUsuario;
		        long numDivisores;
		        Ejercicio1 ej1 = new Ejercicio1();
		        ej1.lectura = new Scanner(System.in);
		        
		        numeroUsuario = ej1.lectura.nextInt();
		        numDivisores = ej1.primeDivisors(numeroUsuario);
		        
		        System.out.println(MENSAJE + numDivisores);
		        ej1.lectura.close();
		    }

		    private long primeDivisors(long number) {
		        int cont = 0;
		        
		        for(int i=2; i<=number; i++) {
					Ejercicio1 ej1 = null;
					if((number%i==0) && ej1.isPrime(i)) {
		                cont++;
		            }
		        }
		        
		        return cont;
		    }
		    
		    public boolean isPrime(long number) {
		        boolean esPrimo = true;
		        for(int i=2; i<number; i++) {
		            long modulo = number%i;
		            if(modulo == 0) {
		                esPrimo = false;
		                break;
		            }
		        }
		        return esPrimo;

	}

}
