package Ex4;

import Excepciones.MyException;

public class Operaciones {
	
	private final static double DEFAULTA=2, DEFAULTB=2;
	
	private double a,b;
	
	public Operaciones() {
		this.a=DEFAULTA;
		this.b=DEFAULTB;
	}

	public Operaciones(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void calculaTodo() throws MyException {
		System.out.println("Operaciones entre A("+a+") y B("+b+")");
		suma();
		resta();
		multiplicacion();
		potencia();
		division();
		raizCuadrada();
		raizCubica();
	}
	
	public void suma() {
		System.out.println("A + B es "+(a+b));
	}
	
	public void resta() {
		System.out.println("A - B es "+(a-b));
	}
	
	public void multiplicacion() {
		System.out.println("A * B es "+(a*b));
	}
	
	public void potencia() {
		System.out.println("A ^ B es "+(Math.pow(a, b)));
	}
	
	public void division() throws MyException{
		try {
			if (b==0)
				throw new MyException("No se puede dividir por 0");
			else
				System.out.println("A / B es "+(a*b));
		}
		catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
		
		public void raizCuadrada() throws MyException{
			calcularRaizCuadrada(a);
			calcularRaizCuadrada(b);
		
	}

		public void calcularRaizCuadrada(double n) throws MyException{
			try {
				if (n<0)
					throw new MyException("No se puede obtener la raíz cuadrada de "+n);
				else
					System.out.println("La raíz cuadrada de "+n+" es "+Math.sqrt(n));
			}
			catch (MyException e) {
				System.err.println(e.getMessage());
			}
		}

		public void raizCubica(){
			System.out.println("La raíz cúbica de "+a+" es "+Math.cbrt(a));
			System.out.println("La raíz cúbica de "+b+" es "+Math.cbrt(b));

		}


	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public static double getDefaulta() {
		return DEFAULTA;
	}

	public static double getDefaultb() {
		return DEFAULTB;
	}
	
	
}
