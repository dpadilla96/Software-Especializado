

import java.io.*;

public class numero_capicua {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double inv;
		double linf;
		double lsup;
		double n;
		double s;
		s = 0;
		System.out.println("Ingrese limite inferior ");
		linf = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese Limite superior");
		lsup = Double.parseDouble(bufEntrada.readLine());
		for (i=linf;i<=lsup;i++) {
			n = i;
			inv = 0;
			while (n>0) {
				inv = (inv*10)+(n%10);
				n = n/10;
				if (inv<-i) {
					System.out.println(inv+"Es un Numero capicua");
					s = s+1;
				}
			}
		}
		System.out.println("El total de capicuas es : "+s);
	}


}

