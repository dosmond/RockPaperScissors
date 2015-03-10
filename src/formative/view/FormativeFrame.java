package formative.view;

import javax.swing.JFrame;

import formative.controller.FormativeController;

public class FormativeFrame extends JFrame
{

private FormativePanel basePanel;
	
	public FormativeFrame(FormativeController baseController)
	{
		basePanel = new FormativePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setVisible(true);
		
	}
	
}
