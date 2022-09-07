package app;

import java.util.Locale;
import java.util.Scanner;

public class ArrayApproved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.
		sc.nextLine(); // ------------------------------------------^

		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (1 + i) + "o aluno:");
			System.out.print("Nome: ");
			name[i] = sc.nextLine();

			System.out.print("Grade[1]: ");
			grade1[i] = sc.nextDouble();
			System.out.print("Grade[2]: ");
			grade2[i] = sc.nextDouble();
			sc.nextLine(); // ------------------------------------------^
		}

		System.out.println("Alunos aprovados:");
		double avgGrade = 0.0;
		for (int i = 0; i < n; i++) {
			avgGrade = (grade1[i] + grade2[i]) / 2;
			if (avgGrade >= 6.0) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}
}
