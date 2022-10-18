package Ex1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex1App {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int r = rand.nextInt(499)+1;
		
		Scanner teclado = new Scanner(System.in);
		int intentos=0;
		int apuesta=-1;
		boolean fin = false;
		do {
			try{
				System.out.println("Adivina el número entre 1 y 500");
				apuesta = teclado.nextInt();
				if (apuesta>500 || apuesta<1)
					System.out.println("Acabas de desperdiciar un intento");
				else if(apuesta<r)
					System.out.println("El número que tienes que adivinar es mayor!");
				else if(apuesta>r)
					System.out.println("El número que tienes que adivinar es menor!");
				else
					 fin = true;
				
			}
			catch(InputMismatchException e) {
				System.err.println("Solo había una norma y no eres capaz de cumplirla?\nPon un número anda");
				String linea = teclado.nextLine();
			}
			intentos ++;
			
		}while(!fin);
		
		System.out.println("Al fin acabaste, necesitaste "+intentos+" intentos");
		

	}

}
