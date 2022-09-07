package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayGenHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.
		sc.nextLine(); // ------------------------------------------^

		char[] gen = new char[n];
		double[] height = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (1 + i) + "a pessoa:");
			height[i] = sc.nextDouble();

			System.out.print("Genero da " + (1 + i) + "a pessoa:");
			gen[i] = sc.next().charAt(0);
		}

		double maxHeight = 0.0;
		for (int i = 0; i < n; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
			}
		}
		double minHeight = maxHeight;
		for (int i = 0; i < n; i++) {
			if (height[i] < minHeight) {
				minHeight = height[i];
			}
		}

		System.out.println("Menor altura = " + minHeight);
		System.out.println("Maior altura = " + maxHeight);

		double avg = 0.0;
		int auxF = 0;
		int auxM = 0;
		for (int i = 0; i < n; i++) {
			if (gen[i] == 'F') {
				avg += height[i];
				auxF += 1;
			} else {
				auxM += 1;
			}
		}
		System.out.printf("Media das alturas das mulheres = %.2f%n", (avg / auxF));
		System.out.println("Numero de homens = " + auxM);

		sc.close();

	}

}
