//Animal.java
//SUPERclass


public abstract class Animal implements Moveable {
	private String species;
    private int age;
    private String food;
    
    public Animal(String newType, int newAge, String newFood)
    {
        species = newType;
        age = newAge;
        food = newFood;
    }
	
	public Animal()
    {
        species = "N/A";
        age = 0;
        food = "N/A";
    }
	
	public Animal (Animal other)
	{
		this(other.getSpecies(), other.getAge(), other.getFood());
	}
    
	public void setSpecies(String newSpecies)
	{
		species = newSpecies;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public void setFood(String newFood)
	{
		food = newFood;
	}
	
    public String getSpecies()    { return species; }
	
    public int getAge()    { return age; }
	
	public String getFood() { return food; }
    
	public void sleep()
	{
		System.out.println("This animal sleeps");
	}
	
	public void feed(double quantity)
    { 
        System.out.printf("Give this animal " + food + "-" + quantity + "kg."); 
    }
	
	//this method should implement a simulation of the animal movement on the screen
	//for testing purposes, we will only display a text indicating the type of movement
	//as this is going to be completely different for all animals, we'll make it abstract
//    public abstract void move() ;
    
	public String toString(){
		return  species + " of age: " + age + " eating: " + food;
	}
	

}
