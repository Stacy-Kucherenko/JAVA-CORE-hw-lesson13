package lviv.lgs.ua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerkhovnaRada {
	
	private static VerkhovnaRada instance = new VerkhovnaRada();
	

	private VerkhovnaRada () {
		
	}
	
	public static VerkhovnaRada getInstance () {
		
		if (instance == null) {
			instance = new VerkhovnaRada();
		}
		return instance;
		
	}



	List <Faction> VerkhovnaRadaArray = new ArrayList <Faction>();
	
	public void addFaction() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		Faction faction = new Faction(factionName);
		VerkhovnaRadaArray.add(faction);
		System.out.println(faction.toString() + " successfully added to the Verkhovna Rada");
		
	}
	
	public void removeFaction () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		Iterator <Faction> iterator = VerkhovnaRadaArray.iterator();
		
		while (iterator.hasNext()) {
			Faction nextFaction = iterator.next();
			if(nextFaction.getFactionName().equalsIgnoreCase(factionName)) {
				iterator.remove();
				System.out.println(nextFaction.toString() + " successfully removed from the Verkhovna Rada");
			} 
			
		}
			
	}
	
	public void getAllFactions() {
		
		System.out.println("Fractions registered in the Verkhovna Rada: ");
		for (Faction faction : VerkhovnaRadaArray) {
			System.out.println(faction.toString());
		}
	}

	public void getFaction() {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
				if (faction.getFactionName().equalsIgnoreCase(factionName)) {
					System.out.println(faction.toString());
					faction.getAllDeputies();
				}
			}
		} 
		
		
		
	}
	
	public void addDeputyToFaction() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
			  if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				 faction.addDeputy();
				 System.out.println(faction.toString());
			  }else {
					System.out.println("Entered faction dosen't exist in the Verkhovna Rada");
				}
			}
		} 
	}
	
	public void removeDeputyFromFaction() {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
			  if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.removeDeputy();
			  }
			}
		} else {
			System.out.println("Entered faction dosen't exist in the Verkhovna Rada");
		}
		
	}
	
	public void getAllBribeTakers () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
			  if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.getBribeTakers();;
			  }
			}
		} else {
			System.out.println("Entered faction dosen't exist in the Verkhovna Rada");
		}
	}
	
	public void getLargestBribeTAkerFromFAction() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
			  if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.lagestBribeTakerInFaction();
			  }
			}
		} else {
			System.out.println("Entered faction dosen't exist in the Verkhovna Rada");
		}
	}
	
	public void getAllDeputiesFromFaction() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the faction: ");
		String factionName = scanner.next();
		
		boolean InfoCorect = theFactionIsExist(VerkhovnaRadaArray,factionName);
		
		if (InfoCorect) {
			for (Faction faction : VerkhovnaRadaArray) {
			  if(faction.getFactionName().equalsIgnoreCase(factionName)) {
				faction.getAllDeputies();;
			  }
			}
		} else {
			System.out.println("Entered faction dosen't exist in the Verkhovna Rada");
		}
	}
	
	
	
	private boolean theFactionIsExist(List<Faction> verkhovnaRadaArray, String factionName) {
		boolean flag = false; 
		
		for (Faction faction : verkhovnaRadaArray) {
		
			if (faction.getFactionName().equalsIgnoreCase(factionName)) {
				flag = true;
			}
		}
		
		return flag;
	}
	
}
