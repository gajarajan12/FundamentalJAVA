package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class UpdatingArrays {

	public static void main(String[] args)
	{
	  String[]name= {"gaja","livin","lokesh","karthik"};
	  System.out.println("Before Updating");
	  System.out.println(Arrays.toString(name));
	  Scanner scan=new Scanner(System.in);
	  int pos=scan.nextInt();
	  System.out.println("add a new name");
	  String name1=scan.next();
	  name[pos]=name1;
	  
	  System.out.println(Arrays.toString(name));
	  
	  
	  
	
	}
}
