package Arrays;
import java.util.Arrays;
public class SelectionSorting {

	public void sorting(int []arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
				 arr1[i]^=arr1[j];
				 arr1[j]^=arr1[i];
				 arr1[i]^=arr1[j];
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		int [] arr= {10,20,40,30};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		SelectionSorting sort=new SelectionSorting();
		sort.sorting(arr);
		System.out.println("After interchanging"+Arrays.toString(arr));
	}

}
