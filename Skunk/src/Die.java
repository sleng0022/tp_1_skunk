
public class Die 
{
	private int value;
	private int num_roll;
	
	public Die()
	{
		value = 0;
		num_roll = 0;
	}
	
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
