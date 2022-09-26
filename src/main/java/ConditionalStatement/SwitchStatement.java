package ConditionalStatement;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("tell me you number");
		String name=scan.nextLine();
		switch(name)
		{
		case"1":
		{
			System.out.println("you choose option one");	
		}
		break;
		case"2":
		{
			System.out.println("you choose option two");
		}
		break;
		case"3":
		{
		System.out.println("you choose option three");	
		}
		break;
	    default:
	    {
	    	System.out.println("no ne is found");
	    }
	   }
	}
}
