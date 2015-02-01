package Exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int a[]={5,2,6,9,8,9};
		try
		{
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handling ArrayIndexoutofbounds Exception");
			System.out.println("String index out of range: "+e.getMessage());
		}
		try
		{
			Arrays.copyOf(a, 6);
			a[6]=Integer.parseInt("XYZ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handling NumberFormat Exception");
			System.out.println(e.getMessage());
		}
		try
		{
			String obj="XYZ";
			System.out.println(obj.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handling StringIndexOutOfBound Exception");
			System.out.println(e.getMessage());
		}
		try
		{
			Scanner in = null;
			a[6]=in.nextInt();
		}
		catch(NullPointerException e)
		{
			System.out.println("Handling NullPointer Exception");
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
	}

}
