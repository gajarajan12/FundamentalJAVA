package ConditionalStatement;

public class NestedIfStatement {

	public static void main(String[] args)
	{
		float height=170.5f;
		float weight=65.5f;
		
		if(height!=weight)
		{
			if(weight<height)
			{
				System.out.println("this is correct");
			}
		}
		else
		{
			System.out.println("no value is found");
		}
	}

}
