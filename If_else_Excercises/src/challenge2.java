import java.util.Scanner;


public class challenge2 {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
		{
			System.out.print("Number is an even number");
		}
		else
		{
			System.out.print("Number is an odd number");
		}
		

	}

}
