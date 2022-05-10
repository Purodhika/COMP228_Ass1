package exercise1;

	import javax.swing.JOptionPane;



	public class InsuranceDriver 
	{
		public static void main(String[] args)
		{   
			//creating array to gather all inputs
			Insurance[] insurance = new Insurance[3];
			for (int i=0; i<3; i++)
			{
				String typeofinsurance = JOptionPane.showInputDialog(null, "Select the type of insurance- Life or Health");
				Insurance i1;
				
				if(typeofinsurance.equals("Life"))
				    //takes argument to Life class
					i1 = new Life();
				
				else
					//takes user to Health insurance
					i1 = new Health();
				
				insurance[i] = i1;
				
				//taking monthly cost from user
				double monthlycost = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the monthly cost"));
				insurance[i].setInsuranceCost(monthlycost);
			
				//displays the final output
				JOptionPane.showMessageDialog(null, i1.displayInfo());
					
	         }
		}
	}
	

