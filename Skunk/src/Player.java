
public class Player 
{
	
	private int total_score;
	
	public Player()
	{
		total_score = 0;
	}
	
	public void add(int score)
	{
		total_score += score;
	}
	
	public void resetScore()
	{
		total_score = 0;
	}
	
	public int getScore()
	{
		return total_score;
	}
	
}
