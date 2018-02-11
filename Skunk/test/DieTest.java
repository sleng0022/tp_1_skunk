import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest 
{

	@Test
	public void test() 
	{
		Die die1 = new Die();
		die1.roll();
		assertEquals(1, die1.getValue());
		die1.roll();
		assertEquals(2, die1.getValue());
		die1.roll();
		assertEquals(3, die1.getValue());
		die1.roll();
		assertEquals(4, die1.getValue());
		die1.roll();
		assertEquals(5, die1.getValue());
		die1.roll();
		assertEquals(6, die1.getValue());
		die1.roll();
		assertEquals(1, die1.getValue());
	}

}
