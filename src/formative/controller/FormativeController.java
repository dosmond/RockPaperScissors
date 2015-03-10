package formative.controller;

import formative.view.FormativeFrame;

public class FormativeController
{

	private FormativeFrame baseFrame;
	
	public FormativeController()
	{
		baseFrame = new FormativeFrame(this);
	}
	
	public void start()
	{
		
	}

	public FormativeFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public int enemyChoice()
	{
		int enemyResponse = (int)(Math.random()*3);
		
		return enemyResponse;
	}
	
	public int gameWinner(int userInput, int enemyInput)
	{
		int winner = 0;
		
		//Rock
		if (userInput == 0)
		{
			if (enemyInput == 0)
			{
				winner = 0;
			}
			else if(enemyInput == 1)
			{
				winner = -1;
			}
			else if(enemyInput == 2)
			{
				winner = 1;
			}
		}
		//Paper
		if (userInput == 1)
		{
			if (enemyInput == 0)
			{
				winner = 1;
			}
			
			else if(enemyInput == 1)
			{
				winner = 0;
			}
			else if(enemyInput == 2)
			{
				winner = -1;
			}
		}
		//Scissors
		else if (userInput == 2)
		{
			if (enemyInput == 0)
			{
				winner = -1;
			}
			else if(enemyInput == 1)
			{
				winner = 1;
			}
			else if(enemyInput == 2)
			{
				winner = 0;
			}
		}
		return winner;
	}
	
}
