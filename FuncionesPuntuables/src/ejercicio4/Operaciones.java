package ejercicio4;

public class Operaciones{
	
static double num1, num2; //Declaramos las variables globales num1 y num2

//Función encargada de su suma
public double suma() {
		double suma;
		suma=num1+num2;
				return suma;
}

//Función encargada de su resta
public double resta() {
	double resta;
	resta=num1-num2;
			return resta;
}

//Función encargada de su multiplicación
public double multiplicacion() {
	double multiplicacion;
	multiplicacion=num1*num2;
			return multiplicacion;
}

//Función encargada de su división
public double division() {
	double division;
	if (num1==0 | num2==0) {
		System.out.println("No se puede dividir por cero");
		division=0;
		return division;
	}
	else {
	division=num1/num2;
			return division;
}
}}