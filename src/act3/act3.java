package act3;

import java.util.Random;
import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		int num1, num2;
		
	    while (true) {
            System.out.print("Introduce el primer número entero: ");
            num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            num2 = scanner.nextInt();

            if (num1 != num2) {
            	 System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            }
            int menor = Math.min(num1, num2);
            int mayor = Math.max(num1, num2);

            System.out.println("\nNúmeros entre " + menor + " y " + mayor + ", incrementando de 7 en 7:");

            for (int i = menor; i < mayor; i += 7) {
                System.out.println(i);
            }

            scanner.close();
		
		
		
		
		
		
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
