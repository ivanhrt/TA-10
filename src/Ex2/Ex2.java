package Ex2;

import Excepciones.MyException;

public class Ex2 {

	public static void main(String[] args) throws MyException{
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MyException("Esto es un objeto de mi propia excepcion");
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Programa finalizado");
	}

}
