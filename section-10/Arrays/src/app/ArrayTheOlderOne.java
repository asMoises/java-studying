package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayTheOlderOne {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.
		sc.nextLine(); // ------------------------------------------^

		String[] name = new String[n];
		int[] age = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (1 + i) + "a pessoa:");
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			sc.nextLine(); // ------------------------------------------^
		}

		int aux = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] > aux) {
				aux = age[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (age[i] == aux) {
				System.out.println("PESSOA MAIS VELHA: " + name[i]);
				break;
			}
		}
		sc.close();

	}

}
