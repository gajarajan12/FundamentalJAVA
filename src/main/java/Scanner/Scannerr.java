package Scanner;
import java.util.Scanner;
public class Scannerr {

	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("tell me what is your fav person");
	 String name=scan.nextLine();
	 System.out.println("your fav person is:"+name);
	 System.out.println( "tell me your mobile number" );
	 long number=scan.nextLong();
	 System.out.println("my mobile number is"+number);
	 

	}

}
