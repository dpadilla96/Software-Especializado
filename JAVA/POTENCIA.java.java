import java.util.Scanner;
public class N_potencia {
	//Calcular la n - ésima potencia de un número, utilizando la operación producto.
	public static void main(String args[]){
	Scanner p3 = new Scanner(System.in);
	
	double x;
	System.out.println("Vamos a calcular la n - ésima potencia de un número utilizando su producto\n");
	System.out.println("Por favor ingrese un número");
	double num1 = p3.nextDouble();
	System.out.println("Por favor ingrese su exponente");
	double expon = p3.nextDouble();
	double resultado = Math.pow(num1, expon);
	System.out.println("El resultado de la operación es "+resultado);

	}
}
