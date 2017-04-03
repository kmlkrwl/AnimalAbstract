//Reptile.java
//SUBclass and SUPERclass


public abstract class Reptile extends Animal {
	private double length;
       
    public Reptile(String newType, int newAge, String newFood, double newLength)
    {
        super(newType, newAge, newFood);
        length = newLength;
    }
    
	public void setLength(double newLength)
	{
		length = newLength;
	}
    public double getLength()    { return length; }
	
	@Override
	public void feed(double quantity)
    { 
        super.feed(quantity);
        System.out.printf("Feed 5 times a day"); 
    }
	
	//this method should implement a simulation of the animal movement on the screen
	//for testing purposes, we will only display a text indicating the type of movement
	// @Override
	
 //    public void move()
 //    { 
 //        System.out.printf(" Reptile movement\n"); 
 //    }
	
	@Override
	public String toString(){
		return  super.toString() + " of length: " + length +" ";
		}

}
