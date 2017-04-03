

public class Bird extends Animal {
	private double wingSpan;
    
    public Bird(String newType, int newAge, String newFood, double newWingSpan)
    {
        super(newType, newAge, newFood);
        wingSpan = newWingSpan;
    }
    
	public void setWingSpan(double newWingSpan) { wingSpan = newWingSpan;}
	
	public double getWingSpan() {return wingSpan;}
	
	@Override
	public void feed(double quantity)
    { 
        super.feed(quantity);
        System.out.printf("Feed 10 times a day"); 
    }
    
	//this method should implement a simulation of the animal movement on the screen
	//for testing purposes, we will only display a text indicating the type of movement
	@Override
    public void move()
    { 
        System.out.printf(" Flies\n "); 
    }
    
	@Override
	public String toString(){
		return  " Bird: " + super.toString() 
        + " wing span of: " + wingSpan + "\n";
		}

}
