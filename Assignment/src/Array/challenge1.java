package Array;

public class challenge1 {

	public static void main(String[] args) 
	{
		int array[]={9,2,5,6,3,4,8};
		for(int i=array.length;i>0;i--)
		{
			System.out.print(array[i-1]);
			if(i>1)
			{
				System.out.print(",");
			}
		}
		// TODO Auto-generated method stub

	}

}
