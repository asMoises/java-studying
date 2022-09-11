package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListApp01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Bob");
		list.add("Anna");

		System.out.println(list.size() + "\n");

		for (String x : list) {
			System.out.println(x);
		}

		list.remove("Anna");
		System.out.println("");

		for (String x : list) {
			System.out.println(x);
		}

		list.remove(1);
		System.out.println("");

		for (String x : list) {
			System.out.println(x);
		}

		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("");
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // this will return -1 (not found)!

		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Anna");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("\nOriginal List:");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("\nResut list:");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("The first starting with A");
		String name = result.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);

	}

}
