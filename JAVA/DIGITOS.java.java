

import java.io.*;

public class digitos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int conjunto[];
		int contador;
		int i;
		int suma;
		conjunto = new int[5];
		suma = 0;
		contador = 0;
		suma = contador;
		for (i=1;i<=5;i++) {
			System.out.println("Ingrese un elemento Array");
			conjunto[0] = Integer.parseInt(bufEntrada.readLine());
			if (i>0) {
				suma = suma+conjunto[0];
			}
		}
		// Calcular y mostrar la media
		System.out.println("La suma de los elementos array es de : "+suma);
	}


}

