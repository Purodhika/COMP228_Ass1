package exercise3;

public class BusinessMortgage extends Mortgage
{
		
	//default constructor
	public BusinessMortgage()
	{
		
	}
	
	//overrides the setinterestrate method of Mortgage class
	@Override
	public void setInterestRate(double interestrate)
	{
		this.interestrate = interestrate +1;
		
	}
}

