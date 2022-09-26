package Inheritance;

public class MultilevelInheritance03 extends MultilevelInheritance02
{
public void son()
{
	System.out.println("i love my family");

}
	public static void main(String[] args)
	{
		MultilevelInheritance03 obj = new MultilevelInheritance03();
		obj.son();
		obj.father();
		obj.grandfather();
	}

}
