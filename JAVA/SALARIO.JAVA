import java.util.Scanner;
public class Salario {
	public static void main(String args[]){
	Scanner p3 = new Scanner(System.in);
	System.out.println("Programa para calcular salarios");
	
	System.out.println("El salario pagado por hora es de 100 pesos \n");
	System.out.println("Si trabajaste mas de 40 horas se te pagará a 150 pesos");
	System.out.println("Ingresa las horas trabajadas: ");
	int horas = p3.nextInt();
	if (horas>40) {
	var pago = horas*1.5*100;
	System.out.println("Tu pago será de $"+pago+" pesos");
	}
	else {
	var pago = horas*1*100;
	System.out.println("Tu pago será de $"+pago+" pesos");
		}
	}
}
