

public class Fish extends Animal {
	private double weight;
    private double length; 
    
    public Fish(String newType, int newAge, String newFood, double newWeight, double newLength)
    {
        super(newType, newAge, newFood);
        length = newLength;
        weight = newWeight;
    }
    
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public double getWeight()    { return weight; }
	public double getLength()    { return length; }
	
	@Override	
	 public void sleep()
	{
		System.out.println("This animal does not sleep");
	}
	
	@Override
    public void feed(double quantity)
    { 
        super.feed(quantity);
        System.out.printf("Feed 3 times a day"); 
    }    
	
	@Override
    public void move()
    { 
        System.out.printf(" Swims\n"); 
    }
    
	@Override
	public String toString(){
		return  " Fish: " + super.toString() + " of weight " + weight + " length " + length + "\n";
		}

}
