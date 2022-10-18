package Ex3;

import java.util.Random;

import Excepciones.MyException;

public class Ex3 {

	public static void main(String[] args) throws MyException{
		try {
			System.out.println("Generando número aleatorio...");
			Random rand = new Random();
			int r = rand.nextInt(999);
			System.out.println("El número aleatorio generado es: "+r);
			
			if (r%2==0)
				throw new MyException("Es par");
			else
				throw new MyException("Es impar");
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Programa finalizado");
	}
}
