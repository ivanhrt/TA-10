package Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

import Excepciones.MyException;

public class Ex4 {

	public static void main(String[] args) throws MyException {
		boolean sonDouble = false;
		double a=0,b=0;
		Scanner teclado = new Scanner(System.in);
		
		do{
			try{
				System.out.println("Escribe dos valores para hacer operaciones entre ellos");
				a = teclado.nextDouble();
				b = teclado.nextDouble();
				sonDouble = true;
			}
			catch (InputMismatchException e){
				System.err.println("Los valores no son double");
				teclado.nextLine();
			}
			
		}while (!sonDouble);
		
		Operaciones op = new Operaciones(a,b);
		op.calculaTodo();

	}

}
