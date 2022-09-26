package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SearchingArrays {
	public static void main(String[] args) 
{
 String[]name= {"gaja","livin","lokesh","surya","vimal"};
 System.out.println("what is your fav person");
 System.out.println(Arrays.toString(name));
 Scanner scan=new Scanner(System.in);
 String name1=scan.nextLine();
 System.out.println("your fav person is"+name1);
 
 for(int i=0;i<name.length;i++)
 {
	if(name1.equalsIgnoreCase(name[i]))
	{
		System.out.println("your fav name has founded");
	  break;
	}
	  System.out.println("no one has founded");
	  break;
 }
 
		 
		 
		 
		 
		 
		 
}
	  
	 
	 
	 
	 
	 

	}
