package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Array_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho do vetor de produtos: ");
		int n = sc.nextInt(); // after nextInt() it is necessary a a nextLine() to get the last line.

		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Produto: ");
			String name = sc.nextLine();
			
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			
		}
		System.out.println("OK!");
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		
		sc.close();

	}

}
