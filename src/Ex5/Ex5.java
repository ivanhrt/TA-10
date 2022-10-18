package Ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

import Excepciones.MyException;

public class Ex5 {

	public static void main(String[] args) throws MyException{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la longitud de las contraseñas que vas a generar");
		int longitud=8;
		
		try {
			longitud = teclado.nextInt();
			System.out.println("Introduce cuantas contraseñas vas a generar");
			int n=teclado.nextInt();
			if (n<1)
				throw new MyException("Cantidad incorrecta");
			Password contraseñas[] = new Password[n];
			for (int i=0; i<n;i++) {
				contraseñas[i]= new Password(longitud);
				System.out.println(contraseñas[i].getContraseña() + "\t" + contraseñas[i].esFuerte());
			}
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("No es un entero");
		}
		

	}

}
