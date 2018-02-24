import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest 
{

	@Test 
	public void test_die_roll() 
	{
		SimDie die1 = new SimDie();
		die1.roll();
		assertEquals(1, die1.getValue());
	}
	
	@Test
	public void test_die_roll_expect_to_get_sequence_value()
	{
		SimDie die1 = new SimDie();
		for(int i =1; i<7;i++)
		{
			die1.roll();
			assertEquals(i, die1.getValue());
		}
	}
	
	@Test
	public void test_die_roll_value_reset_after_sixth_roll()
	{
		SimDie die1 = new SimDie();
		for(int i =1; i<8;i++)
		{
			die1.roll();
		}
		assertEquals(1, die1.getValue());
	}
	
}
