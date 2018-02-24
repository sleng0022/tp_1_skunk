
public class SimDie 
{
	private int value;
	private int num_roll;
	
	public SimDie()
	{
		value = 0;
		num_roll = 0;
	}
	
	//Roll function. Makes sure die value wraps around 6 to 1
	public void roll()
	{
		num_roll++;
		if(num_roll>6)
		{
			num_roll = 1;
		}
		value = num_roll;
	}
	
	public int getValue()
	{	
		return value;
	}
}
