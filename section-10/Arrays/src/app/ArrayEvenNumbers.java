package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayEvenNumbers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Tamanho do vetor de números: ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		Integer[] vect = new Integer[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			int aux = sc.nextInt();

			if (aux % 2 == 0) {
				vect[i] = aux;
			}
		}

		int aux = 0;

		for (int i = 0; i < n; i++) {
			if (vect[i] != null) {
				System.out.print(vect[i] + " ");
				aux += 1;
			}
		}
		System.out.println("\n\nQUANTIDADE DE PARES = " + aux);
		sc.close();
	}

}
