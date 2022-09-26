package Inheritance;

public class HierchicalInHeritance2 extends HierchicalInHeritance
{
	public void father1()
	{
		System.out.println("father name is");
	}

	public static void main(String[] args) {
		
		HierchicalInHeritance2 obj = new HierchicalInHeritance2();
		obj.father1();
		obj.grandfather1();
	}

}
