package formative.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import formative.controller.FormativeController;

public class FormativePanel extends JPanel
{

	private FormativeController baseController;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private SpringLayout baseLayout;
	private JLabel enemyLabel;
	private JLabel resultLabel;
	
	public FormativePanel(FormativeController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		
		enemyLabel = new JLabel("Enemy choice is: ");
	
		resultLabel = new JLabel("The Winner Is: ");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.gray);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		this.add(enemyLabel);
		this.add(resultLabel);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, enemyLabel, 53, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, resultLabel, 54, SpringLayout.SOUTH, enemyLabel);
		baseLayout.putConstraint(SpringLayout.WEST, resultLabel, 179, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, enemyLabel, 0, SpringLayout.EAST, resultLabel);
		
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 82, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rockButton, -44, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 75, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.EAST, scissorsButton, -40, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				int enemyChoice = baseController.enemyChoice();
				
				if(enemyChoice == 0)
				{
					enemyLabel.setText("Enemy choice is: Rock");
				}
				if(enemyChoice == 1)
				{
					enemyLabel.setText("Enemy choice is: Paper");
				}
					
			    if(enemyChoice == 2)
			    {
			    	enemyLabel.setText("Enemy choice is: Scissors");
			    }
				
				
				
				if(baseController.gameWinner(0, enemyChoice) == -1)
				{
					resultLabel.setText("You Lose");
				}
				if(baseController.gameWinner(0,enemyChoice) == 0)
				{
					resultLabel.setText("It's a Tie!");
				}
				if(baseController.gameWinner(0, enemyChoice) == 1)
				{
					resultLabel.setText("You Win!");
				}
			}
			
		});
		
		paperButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				int enemyChoice = baseController.enemyChoice();
				
				if(enemyChoice == 0)
				{
					enemyLabel.setText("Enemy choice is: Rock");
				}
				if(enemyChoice == 1)
				{
					enemyLabel.setText("Enemy choice is: Paper");
				}
					
			    if(enemyChoice == 2)
			    {
			    	enemyLabel.setText("Enemy choice is: Scissors");
			    }
				
				
				if(baseController.gameWinner(1, enemyChoice) == -1)
				{
					resultLabel.setText("You Lose");
				}
				if(baseController.gameWinner(1, enemyChoice) == 0)
				{
					resultLabel.setText("It's a Tie!");
				}
				if(baseController.gameWinner(1, enemyChoice) == 1)
				{
					resultLabel.setText("You Win!");
				}
			}
			
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				
				int enemyChoice = baseController.enemyChoice();
				
				if(enemyChoice == 0)
				{
					enemyLabel.setText("Enemy choice is: Rock");
				}
				if(enemyChoice == 1)
				{
					enemyLabel.setText("Enemy choice is: Paper");
				}
					
			    if(enemyChoice == 2)
			    {
			    	enemyLabel.setText("Enemy choice is: Scissors");
			    }
				
				
				if(baseController.gameWinner(2,enemyChoice) == -1)
				{
					resultLabel.setText("You Lose");
				}
				if(baseController.gameWinner(2, enemyChoice) == 0)
				{
					resultLabel.setText("It's a Tie!");
				}
				if(baseController.gameWinner(2, enemyChoice) == 1)
				{
					resultLabel.setText("You Win!");
				}
			}
			
		});
	}
}
