
public class SimDice
{
	private SimDie die1 = new SimDie();
	private SimDie die2 = new SimDie();
	
	public SimDice()
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
