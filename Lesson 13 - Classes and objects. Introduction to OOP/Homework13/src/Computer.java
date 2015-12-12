public class Computer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer firstComputer = new Computer();
		firstComputer.year = 2013;
		firstComputer.price = 599.99;
		firstComputer.hardDiskMemory = 250;
		firstComputer.freeMemory = 3;
		firstComputer.operationSystem = "Linux SUSE";
		firstComputer.changeOperationSystem("Windows 8");
		firstComputer.ComputerSpecification();
		System.out.println();
		System.out.println();

		Computer secondComputer = new Computer();
		secondComputer.year = 2015;
		secondComputer.price = 1999.99;
		secondComputer.isNotebook=true;
		secondComputer.hardDiskMemory = 1000;
		secondComputer.freeMemory = 4000;
		secondComputer.operationSystem = "Windows 8";
		secondComputer.useMemory(100);
		secondComputer.ComputerSpecification();
	}

	
	short year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	void changeOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	void useMemory(int memory) {
		if (this.freeMemory < memory)
			System.out.println("Not enough free memory!");
		else
			this.freeMemory = memory;
	}

	void ComputerSpecification() {
		System.out.print("Year " + this.year  + "\n Price " + this.price
				+ "\n IsNotebook " + this.isNotebook + "\n HardDiskMemory "
				+ this.hardDiskMemory + "\n FreeMemory " + this.freeMemory
				+ "\nOperationSystem " + this.operationSystem);
	}
}