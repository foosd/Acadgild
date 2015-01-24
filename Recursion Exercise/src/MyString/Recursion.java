package MyString;

public class Recursion 
{
	public static void reverse(String obj)
	{
		int n=obj.length();
		System.out.print(obj.charAt(n-1));
		n--;
		obj=obj.substring(0, obj.length()-1);
		if(n>0)
		{
			reverse(obj);
		}
	}
}
