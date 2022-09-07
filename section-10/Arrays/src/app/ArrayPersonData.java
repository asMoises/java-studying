package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class ArrayPersonData {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número de pessoas: ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.
		sc.nextLine();

		double sum = 0.0;
		double percAge = 0.0;

		Person[] vectPerson = new Person[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nDados da " + (1 + i) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double personHeight = sc.nextDouble();
			sc.nextLine();

			vectPerson[i] = new Person(name, age, personHeight);

			sum += vectPerson[i].getPersonHeight();

			if (vectPerson[i].getAge() < 16) {
				percAge += 1;
			}
		}

		System.out.printf("\nAltura média: %.2f%n", (sum / n));
		percAge = (percAge / n) * 100;
		System.out.println("Pessoas com menos de 16 anos: " + percAge + "%");
		
		for(int i = 0; i < n; i++){
			if (vectPerson[i].getAge() < 16) {
				System.out.println(vectPerson[i].getName());
			}
		}
		

		sc.close();
	}
	
	

}
