package ejercicio2;

public class Esfera {
	
	//Variable global para el radio
	static double radio;

	 public static double superficie() {
		 double superficie;
		 //Fórmula para la superficie
		 superficie=4*(Math.PI) * radio;
					return superficie;
	 }
	public static double volumen() {
		
			//Fórmula para el volumen
			double volumen=((4*(Math.PI)/3) * (Math.pow(radio, 3)));
			return volumen;
	}

}
