package Task01;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	// default constructor
	public Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	// second constructor with parameters
	public Computer(int year, double price, double hardDiskMemory,
			double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;

	}

	// third constructor with parameters

	public Computer(int year, double price, double hardDiskMemory,
			double freeMemory, String operationSystem) {

		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;

		} else if (this.price < c.price) {
			return 1;
		} else

			return 0;

	}
	
	void changeOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	void useMemory(int freeMemory) {
		if (this.freeMemory < freeMemory)
			System.out.println("Not enough free memory!");
		else
			this.freeMemory -= freeMemory;
	}

	void printComputerSpecification() {
		System.out.print("Year " + this.year + "\n Price " + this.price
				+ "\n IsNotebook " + this.isNotebook + "\n HardDiskMemory "
				+ this.hardDiskMemory + "\n FreeMemory " + this.freeMemory
				+ "\nOperationSystem " + this.operationSystem + "\n");
	}

	public static void main(String[] args) {

		Computer firstComputer = new Computer();
		firstComputer.year = 2013;
		firstComputer.price = 500.89;
		firstComputer.hardDiskMemory = 250;
		firstComputer.freeMemory = 3;
		firstComputer.operationSystem = "Linux SUSE";
		firstComputer.changeOperationSystem("Windows 8");
		firstComputer.printComputerSpecification();
		System.out.println();
		System.out.println();

		Computer secondComputer = new Computer();
		secondComputer.year = 2015;
		secondComputer.price = 1399.89;
		secondComputer.isNotebook = true;
		secondComputer.hardDiskMemory = 1000;
		secondComputer.freeMemory = 4000;
		secondComputer.operationSystem = "Windows 8";
		secondComputer.useMemory(100);
		secondComputer.printComputerSpecification();
		
		System.out.println(firstComputer.comparePrice(secondComputer));
		
		
	}
}