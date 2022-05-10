package exercise1;

public class Health extends Insurance
{
	//overriding the setInsurance method to find monthly cost for health insurance
	@Override
	  public void setInsuranceCost(double monthlycost)
	  {
		  this.monthlycost = monthlycost;
	  }
	  
	//displays the monthly cost for health insurance cost
	  @Override
	  public String displayInfo()
	  {
		  return String.format("Health insurance costs $%.2f monthly", getMonthlycost()); 
	  }
}
