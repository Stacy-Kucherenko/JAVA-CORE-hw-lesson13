package lviv.lgs.ua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	private String factionName;

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}
	
	List <Deputy> factionNameArray = new ArrayList <Deputy> (); 
	
	public void addDeputy() {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the surname of the deputy: ");
		String surname = scanner.next();
		
		System.out.println("Enter the name of the deputy: ");
		String name = scanner.next();
		
		System.out.println("Enter the age of the deputy: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter the height of the deputy: ");
		double height = scanner.nextDouble(); 
		
		System.out.println("Enter the weight of the deputy: ");
		double weight = scanner.nextDouble();
		
		Deputy deputy = new Deputy (weight, height, name, surname, age, false); 
		
		if (deputy.isBribeTaker()) {
			deputy.giveBribe();
		}
		
		factionNameArray.add(deputy);
		System.out.println("The deputy " + deputy.toString() + " successfully added to the faction" );
		
	}
	
	
	
	public void removeDeputy() {
		
		Scanner scanner = new Scanner (System.in); 
		System.out.println("Enter the surname of the deputy: ");
		String surname = scanner.next();
		
		System.out.println("Enter the name of the deputy: ");
		String name = scanner.next();
		
		boolean corectInfo = deputyIsExist (factionNameArray, surname, name);
		
		if (corectInfo) {
			
			Iterator <Deputy> iterator = factionNameArray.iterator();
			
			while (iterator.hasNext()) {
				
				Deputy nextDeputy = iterator.next(); 
				
				if (nextDeputy.getSurname().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
					iterator.remove();
					System.out.println("The deputy " + nextDeputy.toString() + " successfully removed from faction");
				}
			}
			
		} else {
			System.out.println("The input deputy does not exist in faction");
		}
		
	}
	
	public void getBribeTakers () {
		
		System.out.println("Members of the faction who take bribes: ");
		
		for (Deputy deputy : factionNameArray) {
			
			if (deputy.isBribeTaker()) {
				System.out.println(deputy.toString());
			}
			
		}
		
	}
	
	public void lagestBribeTakerInFaction() {
		
		int SizeBribe = 0;
		int deputyIndex = -1;
		
		for (int i = 0; i<factionNameArray.size(); i ++) {
			if (factionNameArray.get(i).getSizeOfTheBribe()>SizeBribe) {
				SizeBribe = factionNameArray.get(i).getSizeOfTheBribe(); 
				deputyIndex = factionNameArray.indexOf(factionNameArray.get(i));
			}
			
			
		}
		
		if (deputyIndex >= 0) {
			System.out.println("The largest bribe-taker");
		} else {
			System.out.println("There are no bribe-takers in this faction");
		}
	}
	
	public void getAllDeputies () {
		System.out.println("All members of this faction: ");
		for (Deputy deputy : factionNameArray) {
			System.out.println(deputy.toString());
		}
	}
	
	public void clearAllFaction() {
		
		factionNameArray.clear();
		System.out.println("All members were successfully removed from the faction");
		
	}

	private boolean deputyIsExist(List<Deputy> factionNameArray, String surname, String name) {
		boolean flag = false; 
		
		for (Deputy deputy : factionNameArray) {
			if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
				flag = true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Faction " + factionName ;
	}

	
	
	
	
}
