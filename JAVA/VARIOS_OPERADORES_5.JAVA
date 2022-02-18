import java.util.Scanner;
public class varios_operadores_5 {
	public static void main (String args[]){
	Scanner p3 = new Scanner(System.in);
	System.out.println("Ingresa un número de 5 cifras");
	int nume_t = p3.nextInt();
	int nume_a = nume_t;
	int nume_b = nume_t;
	int nume_c = nume_t;
	int nume_d = nume_t;
	int nume_e = nume_t;
	int ac = 0;
	if (nume_t>9999 && nume_t < 100000) {
	while (nume_t>=1) {
	nume_t = nume_t/10;
	if (nume_t > 0 && nume_t < 10) {
	ac = nume_t;
		}
	}
	nume_a = nume_b-(nume_a/10)*10;
	nume_c = (nume_b -((nume_c/100)*100))/10;
	nume_d = (nume_b/1000)-(ac*10);
	nume_e = ((nume_b/100)-(ac*100))-(nume_d*10);
	System.out.println(ac+" x "+nume_a+" = "+ac*nume_a);
	System.out.println(nume_c+" - "+nume_d+" = "+(nume_c-nume_d));
	System.out.println(ac+" x "+nume_d+" x "+nume_e+" x "+nume_c+" x "+nume_a+" = " +(ac*nume_d*nume_e*nume_c*nume_a));
			}
	else {
	System.out.println("Ingresa un numero de 5 cifras");
		}
	}
}
