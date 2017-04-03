//BioStudy.java
//program to implement simulation of animal movement
//Polymorphic behaviour example


public class BioStudyAbstract {
	//create a constant GROUPSIZE = 6
	static final int GROUPSIZE = 6;

	public static void main(String args[])
	{
		//create an array of objects of type Animal
		Animal[ ] testGroup = new Animal[GROUPSIZE];
	
		//populate the test group: use new to initialise each array member to an animal from the classes inheriting from Animal
		testGroup[0] = new Snake("Cobra", 2, "insects", 2.5, true);
		testGroup[1] = new Lizard("Blue tongue", 1, "grass", 0.5, 4);
		testGroup[2] = new Fish("Trout", 3, "algae", 0.4, 1.5);
		testGroup[3] = new Bird("Pigeon", 2, "worms", 0.2);
		testGroup[4] = new Fish("myPet", 1, "canned food",0.2,2);
		testGroup[5] = new Snake("T-rex", 100, "people", 40, false);
		
		
	//list all the details for all animals in the test group
	//use an extended for
	for (Animal currentAnimal : testGroup)
			System.out.println(currentAnimal.toString());

	//show sleep habits for all animals in the test group
	//use an extended for
	for (Animal currentAnimal : testGroup){
			System.out.print(currentAnimal.getSpecies() + ": ");
			currentAnimal.sleep();
	}
	//simulate movement for all animals in the test group
	//use an extended for
	for (Animal currentAnimal : testGroup)
			currentAnimal.move();
		
	}

	
}
