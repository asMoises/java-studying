package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayBelowMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		double[] vect = new double[n];
		double avg = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		
		avg = avg / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
