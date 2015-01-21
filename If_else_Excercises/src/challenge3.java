import java.util.Scanner;


public class challenge3 {

	public static void main(String[] args) {
		int year=2013;
		System.out.print("Enter a year ");
		Scanner input=new Scanner(System.in);
		year=input.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.print(year+" is a leap year");
			}
			else
			{
				System.out.print(year+" is a not leap year");
			}
		}
		else
		{
			if(year%4==0)
			{
				System.out.print(year+" is a leap year");
			}
			else
			{
				System.out.print(year+" is a not leap year");
			}
		}
	}

}
