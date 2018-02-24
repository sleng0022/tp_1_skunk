import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	
	
	
	@Test
	public void testAddingScorePlayer1()
	{
		Player player1 = new Player();
		player1.add(3);
	}
	
	@Test 
	public void testGetPlayer1Score()
	{
		Player player1 = new Player();
		player1.add(3);
		assertEquals(3, player1.getScore());
	}
	
	@Test
	public void testAccumilatePlayer1Score()
	{
		Player player1 = new Player();
		player1.add(3);
		assertEquals(3, player1.getScore());
		player1.add(4);
		assertEquals(7, player1.getScore());
	}
	
	@Test 
	public void testResetPlayerScore()
	{
		Player player1 = new Player();
		player1.add(3);
		assertEquals(3, player1.getScore());
		player1.add(4);
		assertEquals(7, player1.getScore());
		player1.resetScore();
		assertEquals(0, player1.getScore());
	}
	
	@Test 
	public void testResetPlayerScoreandAddScoreBack()
	{
		Player player1 = new Player();
		player1.add(3);
		assertEquals(3, player1.getScore());
		player1.add(4);
		assertEquals(7, player1.getScore());
		player1.resetScore();
		assertEquals(0, player1.getScore());
		player1.add(4);
		assertEquals(4, player1.getScore());
	}
}
