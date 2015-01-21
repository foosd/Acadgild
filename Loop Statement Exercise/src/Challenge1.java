
public class Challenge1 {

	public static void main(String[] args) {
		int i,n,flag;
		System.out.println("Prime numbers between 1 to 100");
		for(i=1;i<=100;i++)
		{
			flag=1;
			for(n=1;n<i;n++)
			{
				if(i%n==0)
				{
					flag++;
				}
			}
			if(flag<=2)
			{
				System.out.print(i+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
