package controller;

//Import Section
import model.School;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Controller
{
	private School userSchool;
	
	/**
	 * Builds the instance of the Controller.
	 */
	public Controller()
	{
		userSchool = new School();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		questions();
		list();
	}		
	
	private void questions()
	{
		boolean programContinue = true;
		while(programContinue)
		{
		//------------------------Student Section--------------------------------------------------------------------------
		// verifies if they qualify for the questionnaire
			
		int userInputStudent = JOptionPane.showConfirmDialog(null, "Are you a student?");
	
		if (userInputStudent == JOptionPane.YES_OPTION)
		{
			//------------------------School Section---------------------------------------------------------------------------
			String userInputSchool = JOptionPane.showInputDialog(null, "What school do you go to?");
			while(userInputSchool == null || userInputSchool.equals(""))
			{
				userInputSchool = JOptionPane.showInputDialog(null, "Please enter what school you go to.");
			}
			userSchool.setSchool(userInputSchool);
		// sets input as a capital	
			boolean capital = true;
			int userCapital = JOptionPane.showConfirmDialog(null, "is it ok if I clean that up for you");
			while(capital) {
			
				
				
				if (userCapital == JOptionPane.YES_OPTION)
				{
					
					userInputSchool = userInputSchool.substring(0,1).toUpperCase() + userInputSchool.substring(1).toLowerCase();
					
				}
				
				else {
					
				}

				capital = false;
				userSchool.setSchool(userInputSchool);
			}
			
			//---------------------------------------------------------------------------------------------------------------
			//
			//------------------------Classes Section--------------------------------------------------------------------------
			/**
			 * this makes it to where you have to enter an integer and will keep looping if you don't
			 * this allows you to reenter as well until the !validint is false
			 */
			String userInputClasses = JOptionPane.showInputDialog(null, "How many classes do you have");
			while(!validInt(userInputClasses) || userInputClasses == null || userInputClasses.equals(""))
			{
				userInputClasses = JOptionPane.showInputDialog(null, "You have to enter an integer. How many classes do you have?");
			}
			userSchool.setclassNum(Integer.parseInt(userInputClasses));
			
			//-----------------------------------------------------------------------------------------------------------------
			
			
			//------------------------AP Section-------------------------------------------------------------------------------
			String userInputAP = JOptionPane.showInputDialog(null, "How many AP classes do you have");
			while(!validInt(userInputAP) || userInputAP == null || userInputAP.equals(""))
			{
				userInputAP = JOptionPane.showInputDialog(null, "You have to enter an integer. How many AP classes do you have?");
			}
			userSchool.setAP(Integer.parseInt(userInputClasses));
			//-----------------------------------------------------------------------------------------------------------------
			
			//------------------------CTEC Section-----------------------------------------------------------------------------
			int userInputCTEC = JOptionPane.showConfirmDialog(null, "Are you enrolled in a CTEC class");
			if (userInputCTEC == JOptionPane.YES_OPTION)
			{
				userSchool.setCTEC(true);
			}
			else 
			{
				userSchool.setCTEC(false);
			}
			
			if (userSchool.getCTEC() == true)
				userSchool.setCTECans("are");
			else
			{
				userSchool.setCTECans("are not");
			}
			//-----------------------------------------------------------------------------------------------------------------
			
			
			
		    //-------------------------Final Print Section---------------------------------------------------------------------
		for (int loop = 2; loop >= 0; loop -= 1)
			{
				JOptionPane.showMessageDialog(null,  userSchool);
				
			}
			
			
			programContinue = false;
		}
		    //-------------------------End Student Section---------------------------------------------------------------------
		else
		{
			JOptionPane.showMessageDialog(null, "You are not a student so this app won't be useful to you");
			int restart = JOptionPane.showConfirmDialog(null, "Would you like to restart the program");
			
			if (restart == JOptionPane.YES_OPTION)
			{
				programContinue = true;
			}
			else
			{
				programContinue = false;
			}
		}
	}
}
	/**
	 *this next method makes it to where the program doesn't crash if you put in invalid input.
	 *it also makes it to where it lets you reenter so that you can put in a valid int 
	 *
	 * 
	 */
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a number.");
		}
		return isValid;
	}
	
	/**
	 * this is just a simple list so that you can call different students from a school possibly.
	 */
	private void list()
	{
	while(true)
	{
		ArrayList<String> SchoolList = new ArrayList<String>();
		//creates an array called school list
		SchoolList.add("your mom");
		SchoolList.add("nothing");
		SchoolList.remove("your mom");
		
		
	}
}	
	
	
	
	
	
}
