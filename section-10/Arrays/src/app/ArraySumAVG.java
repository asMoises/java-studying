package app;

import java.util.Locale;
import java.util.Scanner;

public class ArraySumAVG {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		double vect[] = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		String aux = "";
		for (int i = 0; i < n; i++) {
			aux = aux + vect[i] + " ";
		}
		
		System.out.print("VALORES: " + aux+"\n");

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		System.out.printf("SOMA: %.2f%n", sum);
		System.out.printf("MÉDIA: %.2f%n", sum/n);
		
		sc.close();
	}
}
