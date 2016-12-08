package Oracle;

/*
 * Real-world objects contain state and behavior.
 * A software object's state is stored in fields.
 * A software object's behavior is exposed through methods.
 * Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
 * A blueprint for a software object is called a class.
 * Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword.
 * A collection of methods with no implementation is called an interface.
 * A namespace that organizes classes and interfaces by functionality is called a package.
 * The term API stands for Application Programming Interface.
 */

public class Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;   
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" +
				cadence + " speed:" + 
				speed + " gear:" + gear);
	}
	
	class MountainBike extends Bicycle {

	    // new fields and methods defining 
	    // a mountain bike would go here

	}


	public static void main(String[] args) {
		// Create two different 
		// Bicycle objects
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();

		// Invoke methods on 
		// those objects
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}

}
