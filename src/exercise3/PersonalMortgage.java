package exercise3;

public class PersonalMortgage extends Mortgage
{
       //default constructor
	   public PersonalMortgage()
	   {
		   
	   }
			
	    //overrides the setinterestrate method of Mortgage class
		@Override
		public void setInterestRate(double interestrate)
		{
			this.interestrate = interestrate +2;
			
		}
	}

