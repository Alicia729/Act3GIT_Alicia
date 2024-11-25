package act3;

import java.util.Random;
import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		int num1, num2, num3;
		
	    while (true) {
            System.out.print("Introduce el primer número entero: ");
            num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            num2 = scanner.nextInt();
            
            System.out.print("Introduce el tercer número entero: ");
            num3 = scanner.nextInt();


            // Verificar si el tercer número está entre los otros dos
            if (num3 > Math.min(num1, num2) && num3 < Math.max(num1, num2)) {
                System.out.println("El número " + num3 + " está entre " + num1 + " y " + num2);
            } else {
                System.out.println("El número " + num3 + " no está entre " + num1 + " y " + num2);
            }
        }
		
	    import java.util.Random;

	    public class NumerosAleatorios {
	        public static void main(String[] args) {
	            Random random = new Random();

	            for (int i = 0; i < 30; i++) {
	                int numeroAleatorio = random.nextInt(); // Genera un número aleatorio entero
	                System.out.println(numeroAleatorio);
	            }
	        }
	    }
		
		
		
	}

}
