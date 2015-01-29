package Array;
import java.util.*;

public class challenge2 {

	static int[] insertElement(int []a,int e)
	{
		a=Arrays.copyOf(a, a.length + 1);
		a[a.length-1]=e;
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) {
		int array[]={5,8,7,-6,-9,-1,0,4,-2,3};
		int a;
		Arrays.sort(array);
		System.out.println("Sorted array:[Length:"+array.length+"]");
		for(a=0;a<array.length;a++)
		{
			if(a>0)
			{
				System.out.print(",");
			}
			System.out.print(array[a]);
		}
		System.out.println();
		System.out.println("Did'nt find 1 @"+Arrays.binarySearch(array, 1));
		array=insertElement(array, 1);
		System.out.println("With 1 added:[Length:"+array.length+"]");
		for(a=0;a<array.length;a++)
		{
			if(a>0)
			{
				System.out.print(",");
			}
			System.out.print(array[a]);
		}
		// TODO Auto-generated method stub
	}

}
