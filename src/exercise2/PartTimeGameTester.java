package exercise2;

public class PartTimeGameTester extends GameTester
{
    //instance variable to take hours worked
	private int hours;
	
	//default constructor
	public PartTimeGameTester()
	{
		
	}

	//collects hours from driver class
	public int getHours()
	{
		return hours;
	}
	
	//allocates hours
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	   
	//calculates the salary based on hours worked
	@Override
	public int getSalary()
	{
	return hours * 20;
	}

}

