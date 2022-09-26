package Inheritance;

public class SingleInheritance2 extends SingleInheritance
{
  public void students()
  {
	  System.out.println("name is surya");
  }
	
	public static void main(String[] args) 
	{
		SingleInheritance2 obj=new SingleInheritance2();
		obj.parent();
		obj.students();
	}
}
 
