package exercise1;

public abstract class Insurance 
{

	//instance variables of abstract class
		protected String insurancetype;
		protected double monthlycost;
		
		//declaring abstract methods
		public abstract void setInsuranceCost (double monthlycost);
		public abstract String displayInfo();
		
		//collects the type of insurance filled by user
		public String getInsurancetype()
		{
			return insurancetype;
		}
		
	    //collects monthly cost of insurance
		public double getMonthlycost()
		{
			return monthlycost;
		}
}
