
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
	}
	
	public int getValue()
	{
		int[] die_num = new int[]{1,2,3,4,5,6};
		
		value = die_num[num_roll-1];
		
		return value;
	}
}
