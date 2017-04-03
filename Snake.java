

public class Snake extends Reptile {
	private boolean poisonous;
       
    public Snake(String newType, int newAge, String newFood, double newLength, boolean newPoisonous)
    {
        super(newType, newAge, newFood, newLength);
        poisonous = newPoisonous;
    }
    
	public void setPoisonous(boolean newPoisonous) {poisonous = newPoisonous;}
	
	public boolean getPoisonous()
	{
		return poisonous;
	}
	
	//this method should implement a simulation of the animal movement on the screen
	//for testing purposes, we will only display a text indicating the type of movement
	@Override	
    public void move()
    { 
        System.out.printf(" Snake movement\n"); 
    }
    
	@Override
	public String toString(){
		return  " Snake: " + super.toString() + ",poisonous = " 
        + poisonous + "\n";
		}

}
