package MyString;

public class Recursion 
{
	String ch="";
	public String reverse(String obj)
	{
		int n=obj.length();
		ch= ch+Character.toString(obj.charAt(n-1));
		n--;
		obj=obj.substring(0, obj.length()-1);
		if(n>0)
		{
			reverse(obj);
		}
		return ch;
	}
}
