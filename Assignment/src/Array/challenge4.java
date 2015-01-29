package Array;

public class challenge4 {

	public static void main(String[] args) {
		int a[][]={{8,6,1},{4,6,7}};
		int b[][]={{8,1},{6,7},{5,1}};
		try
		{
			for(int i=0;i<a[0].length;i++)
			{
				for(int j=0;j<b[0].length;j++)
				{
					int sum=0;
					for(int k=j;k<b.length;k++)
					{
						sum=sum+(a[i][k]*b[k][j]);
					}
					System.out.print(sum+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e){}
		// TODO Auto-generated method stub
	}

}
