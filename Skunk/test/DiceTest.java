import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest 
{

	@Test
	public void test_getdie1value()
	{
		Dice Pair1 = new Dice();
		Pair1.roll();
		assertEquals(Pair1.getdie1value(), 1);
	}
	
	@Test
	public void test_getdie2value()
	{
		Dice Pair1 = new Dice();
		Pair1.roll();
		assertEquals(Pair1.getdie2value(), 1);
	}
	
	@Test
	public void test_getdicesum()
	{
		Dice Pair1 = new Dice();
		Pair1.roll();
		assertEquals(Pair1.getdicesum(), 2);
	}
	
	@Test
	public void test_resetdicevalues()
	{
		Dice Pair1 = new Dice();
		for(int i = 0; i < 7; i++)
		{
			Pair1.roll();
		}
		assertEquals(Pair1.getdicesum(), 2);
	}



}
