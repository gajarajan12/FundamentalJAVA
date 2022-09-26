package Arrays;
import java.util.Arrays;
public class PassingAnArray {
  
	public void passingarray(double[]salary1)
	{
	 salary1[1]=2000;
	 salary1[2]=3000;
	 salary1[3]=5000;
	 System.out.println(Arrays.toString(salary1));
	}
	
	
	
	public static void main(String[] args)
	{
	 double[] salary= {1000,2000,3000,4000};
	 PassingAnArray pass=new  PassingAnArray();
	 pass.passingarray(salary);
		
		

	}

}
