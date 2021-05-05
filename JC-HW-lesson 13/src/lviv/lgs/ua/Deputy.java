package lviv.lgs.ua;

import java.util.Scanner;

public class Deputy extends Human{

	private String surname;
	private String name; 
	private int age; 
	private boolean bribeTaker; 
	private int sizeOfTheBribe;
	
	public Deputy(double weight, double height, String surname, String name, int age, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getSizeOfTheBribe() {
		return sizeOfTheBribe;
	}

	public void setSizeOfTheBribe(int sizeOfTheBribe) {
		this.sizeOfTheBribe = sizeOfTheBribe;
	}
	
	public void giveBribe () {
		
		if (this.bribeTaker == false) {
			System.out.println("This deputy does not take bribes ");
		} else if (this.bribeTaker == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("The amount of the bribe is ");
			
			int bribeAmount = scanner.nextInt();
			
			if (bribeAmount > 5000) {
				System.out.println("The deputy will be imprisoned by police ");
			} else {
				this.sizeOfTheBribe = bribeAmount;
			}
		}

	
	
	

		
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", isBribeTaker()=" + isBribeTaker() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
