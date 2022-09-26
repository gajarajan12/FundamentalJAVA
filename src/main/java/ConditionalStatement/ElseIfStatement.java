package ConditionalStatement;

public class ElseIfStatement {

	public static void main(String[] args)
	{
       String name="volleyball";
       int a=100;
       int b=200;
       
      if(name=="kabadi")
      {
    	  System.out.println("this is correct");
      }
      else if (name!="volleyball")
      {
    	  System.out.println("this is corrected value");
      }
      else if (a==b)
      {
    	  System.out.println("this is better");
      }
       
      else if(a>b)
      {
    	  System.out.println("this value is noted");
      }
       
      else
      {
    	  System.out.println("no one is found");
      }
       
       
       
	}

}
