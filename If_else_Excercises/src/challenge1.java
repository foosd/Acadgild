import java.util.Scanner;
public class challenge1 
{
	public static void main(String args[])
	{
		int age;
		System.out.print("Enter your age ");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		if(age>18)
		{
			System.out.print("You are elligible to vote");
		}
		else
		{
			System.out.print("You are not elligible to vote");
		}
	}
}
