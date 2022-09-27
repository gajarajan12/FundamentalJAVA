package Arrays;
import java.util.Arrays;
public class BubbleSorting 
{
	
public void sortings(int [] arr1)
{
	int a=10;
	for(int i=0;i<arr1.length;i++)
	{
		for (int j=0;j<arr1.length-i-1;j++)
		{
			if(arr1[j]>arr1[j+1])
			{
			int swap=arr1[j];
			arr1[j]=arr1[j+1];
			arr1[j+1]=swap;
		}
	}
}
}
	public static void main(String[] args)
	{
	   int [] arr= {1,2,6,3,4,8};
	  //Arrays.sort(arr);
	  System.out.println("before update");
	   System.out.println(Arrays.toString(arr));
	   BubbleSorting sort=new BubbleSorting();
	   sort.sortings(arr);
	   System.out.println("after update chaned"+Arrays.toString(arr));
	   
	}

}
