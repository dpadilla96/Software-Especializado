

import java.io.*;

public class fibonacci {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		int i;
		int n;
		System.out.println("Por favor ingresa un numero");
		n = Integer.parseInt(bufEntrada.readLine());
		a = 0;
		b = 1;
		for (i=1;i<=n;i++) {
			System.out.println(""+a);
			c = a+b;
			a = b;
			b = c;
		}
	}


}

