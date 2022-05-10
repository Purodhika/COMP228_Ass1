package exercise1;


public class Life extends Insurance
{ 
  //defines setInsurance cost abstract method
  @Override
  public void setInsuranceCost(double monthlycost)
  {
	  this.monthlycost = monthlycost;
  }
  
  //  //defines displayInfo abstract method

  @Override
  public String displayInfo()
  {
	  return String.format("Life insurance costs $%.2f monthly", getMonthlycost()); 
  }

}
