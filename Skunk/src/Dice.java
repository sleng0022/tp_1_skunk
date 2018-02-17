
public class Dice
{
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	public Dice()
	{
		
	}
	
	public void roll()
	{
		die1.roll();
		die2.roll();
	}
	
	public int getdie1value()
	{
		return die1.getValue();
	}
	
	public int getdie2value()
	{
		return die2.getValue();
	}
	
	public int getdicesum()
	{
		return (die1.getValue() + die2.getValue());
	}
}
