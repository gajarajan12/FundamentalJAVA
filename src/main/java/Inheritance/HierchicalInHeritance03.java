package Inheritance;

public class HierchicalInHeritance03 extends HierchicalInHeritance
{
public void son1()
{
	System.out.println("i love my families");
}
	public static void main(String[] args)
	{
		
		HierchicalInHeritance03 obj = new HierchicalInHeritance03();
		obj.son1();
		obj.grandfather1();
	}

}
