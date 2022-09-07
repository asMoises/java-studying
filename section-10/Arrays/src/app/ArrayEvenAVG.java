package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayEvenAVG {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		double[] vect = new double[n];
		double avg = 0.0;
		int aux = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				avg += vect[i];
				aux += 1;
			}
		}

		if (avg == 0.0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			avg = avg / aux;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		}

		sc.close();
	}
}
