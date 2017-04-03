

public class Lizard extends Reptile {
	private int noOfLegs;
       
    public Lizard(String newType, int newAge, String newFood, double newLength, int newNoOfLegs)
    {
        super(newType, newAge, newFood, newLength);
        noOfLegs = newNoOfLegs;
    }
       
	public void setNoOfLegs(int newNoOfLegs)
	{
		noOfLegs = newNoOfLegs;
	}
	
	    public int getNoOfLegs()    { return noOfLegs; }
	
	//this method should implement a simulation of the animal movement on the screen
	//for testing purposes, we will only display a text indicating the type of movement
	@Override	
    public void move()
    { 
        System.out.printf(" Lizard movement\n"); 
    }
    
	@Override
	public String toString(){
		return  " Lizard: " + super.toString() + "with number of legs: " + noOfLegs + "\n";
		}

}
