package exercise3;

import javax.swing.JOptionPane;

public abstract class Mortgage implements MortgageConstants
{   
	//instance variables of abstract class
	protected int mortgageNumber;
	protected String customername;
	protected double amountofmortgage;
	protected double interestrate;
	protected int term;
	
	//constructor to assign values of variables
	public Mortgage(int mortgageNumber, String customername, int amountofmortgage, double interestrate,
 int term)
	{
		this.mortgageNumber = mortgageNumber;
		this.customername = customername;
		this.amountofmortgage = amountofmortgage;
		this.interestrate = interestrate;
		this.term = term;
			
	}
	
	//default constructor
	public Mortgage()
	{
	
	}
	
	//returns the number of mortgages
	public int getMortageNumber()
	{
		return mortgageNumber;
	}
	
	public void setMortgageNumber(int mortgageNumber)
	{
		this.mortgageNumber = mortgageNumber;
	}

	public String getCustomername()
	{
		return customername;
	}
	
	public void setCustomername(String customername)
	{
		this.customername = customername;
	}
	
	public double getAmountofmortgage(double amountofmortgage)
	{
		return amountofmortgage;
	}
	
	public void setAmountofmortgage(double amountofmortgage)
	{
		//checks if the maxamount is less than $300000 and throws message
		if(amountofmortgage>Maxamount)
		{
			JOptionPane.showMessageDialog(null, "The Mortgage amount should not exceed $300,000");
			
		}
		else
		{
		this.amountofmortgage = amountofmortgage;
		}
	}
	
	public double getInterestRate()
	{
		return interestrate;
	}
	public void setInterestRate(double interestrate)
	{
		this.interestrate = interestrate;
	}
	
	public void setTerm(int term)
	{   
		//checks the duration of term as short, medium or long
		if(term==1)
			this.term = Short_Term;
		else if(term==3)
			this.term= Med_Term;
		else if(term==5)
			this.term=Long_Term;
		else
			this.term=Short_Term;
		
	}
	
	public String getMortgageInfo()
	{   
		//displays all updated data
		String message = String.format("Mortgage Number =" +mortgageNumber + "\n Customer Name:" +customername + "\n Amount=" +amountofmortgage + "\n Rate of Interest=" +interestrate + "\n Term=" +term);
	    return message;
	}

}
	
