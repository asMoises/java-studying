package app;

import java.util.Scanner;

import entities.HostelRoom;

public class ArrayHostelRooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int allRooms = 10;
		HostelRoom[] quartos = new HostelRoom[allRooms];

		System.out.print("How many rooms will be rent? "); // Just x position will be used from a 10 position vector.
		int rentRooms = sc.nextInt();
		sc.nextLine();

		if (rentRooms <= allRooms) {
			for (int i = 0; i < rentRooms; i++) {
				System.out.println("Rent #" + (1 + i) + ": ");
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("e-Mail: ");
				String email = sc.nextLine();
				System.out.print("Quarto: ");
				int room = sc.nextInt();
				sc.nextLine();
				
				for (int y = 0; y < allRooms; y++) {
					if (y == room) {
						quartos[y] = new HostelRoom(room, name, email);
						break;
					}
				}
			}
			
			System.out.println("Busy rooms:");
			for(int i = 0; i < allRooms;i++) {
				if(quartos[i] != null) {
					System.out.println(i + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());
				}
			}
		} else {
			System.out.println("There is no rooms enought!");
		}
		sc.close();
	}
}
