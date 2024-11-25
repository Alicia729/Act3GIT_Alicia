package act3;

import java.util.Random;

public class act3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		
		int[] arrayAleatorio = new int[10];
		 for (int i = 0; i < arrayAleatorio.length; i++) {
	            arrayAleatorio[i] = random.nextInt(20) + 1; // Genera un número entre 1 y 20
	        }
		 for (int num : arrayAleatorio) {
	            System.out.print(num + " ");
	        }

	}
	public static int generarAleatorio() {
		Random random = new Random();
		int aleatorio = random.nextInt();
		return aleatorio;
	}

}
