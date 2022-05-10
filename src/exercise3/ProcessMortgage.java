package exercise3;

import javax.swing.JOptionPane;

public class ProcessMortgage 
{
	public static void main(String[] args)
	{
		Mortgage[] mortgage = new Mortgage[3];
		
		//creates loop and adds values to array
		for(int i = 0; i < 3 ; i++)
		{
			String s1 = JOptionPane.showInputDialog(null, "Please select the type of mortgage: Personal or Business" );
			
			//sepeartes the personal and business mortgage options
			if(s1.equalsIgnoreCase("personal"))
			
				mortgage[i] = new PersonalMortgage();
			
			else
				mortgage[i] = new BusinessMortgage();
			
			mortgage[i].mortgageNumber = i+1;
			String name = JOptionPane.showInputDialog(null, "Please enter customer name:");
			mortgage[i].setCustomername(name);
			double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the mortgage amount:"));
			mortgage[i].setAmountofmortgage(amount);
			double interest = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the interest rate:"));
			mortgage[i].setInterestRate(interest);
			int term1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the term period:"));
			mortgage[i].setTerm(term1);
		}
			//displays the complete information
		for(int i=0; i<mortgage.length;i++)
		{
			String detail = mortgage[i].getMortgageInfo();
			JOptionPane.showMessageDialog(null, detail);
		}
	}

}

