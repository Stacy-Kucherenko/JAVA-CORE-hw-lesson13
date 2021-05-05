package lviv.lgs.ua;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("Enter 1 to add a fraction");
		System.out.println("Enter 2 to delete a specific fraction");
		System.out.println("Enter 3 to display all fractions");
		System.out.println("Enter 4 to clear a specific fraction");
		System.out.println("Enter 5 to display a specific fraction");
		System.out.println("Enter 6 to add a deputy to the faction");
		System.out.println("Enter 7 to remove the Deputy from the faction");
		System.out.println("Enter 8 to display a list of bribe-takers");
		System.out.println("Enter 9 to display the largest bribe taker");
		
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		while(true) {
			menu();
			
			switch(scanner.nextInt()) {
			
			case 1: {
				VerkhovnaRada.getInstance().addFaction();
				break;
			}
			
			case 2: {
				VerkhovnaRada.getInstance().removeFaction();
				break;
			}
			
			case 3: {
				VerkhovnaRada.getInstance().getAllFactions();
				break;
			}
			
			case 4: {
				VerkhovnaRada.getInstance().removeFaction();
				break;
			}
			case 5: {
				VerkhovnaRada.getInstance().getFaction();
				break;
			}
			case 6: {
				VerkhovnaRada.getInstance().addDeputyToFaction();
				break;
			}
			case 7: {
				VerkhovnaRada.getInstance().removeDeputyFromFaction();
				break;
			}
			case 8: {
				VerkhovnaRada.getInstance().getAllBribeTakers();
				break;
			}
			
			case 9: {
				VerkhovnaRada.getInstance().getLargestBribeTAkerFromFAction();
				break;
			}
			
			default: {
				System.out.println("Please, enter a number from 1 to 9");
				break;
			}
			
			
			}
		}
		
		
	}
}
