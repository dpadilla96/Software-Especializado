import java.util.Scanner;
public class Primer_a {
public static void main(String args[]){
	Scanner p3 = new Scanner(System.in);
	System.out.println("Por favor ingresa un numero y te daré el primer digito de izquierda a derecha");
	int numed = p3.nextInt();
	if (numed < 10) {
	System.out.println("el primer y unico digito es "+numed);
	}
	else {
	while (numed>=1) {
	numed = numed/10;
	if (numed > 0 && numed < 10) {
	System.out.println("el primer digito es "+numed);
				}
}
		}
	}
}
