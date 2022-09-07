package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayBiggerValue {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Tamanho do vetor de números: ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		int[] vect = new int[n];
		int[] keyValue = { 0, 0 }; // Key:Value model

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();

			if (vect[i] > keyValue[1]) {
				keyValue[0] = i;
				keyValue[1] = vect[i];
			}
		}

		System.out.println("\nMAIOR VALOR = " + keyValue[1]);
		System.out.println("POSICAO DO MAIOR VALOR = " + keyValue[0]);

		sc.close();

	}

}
