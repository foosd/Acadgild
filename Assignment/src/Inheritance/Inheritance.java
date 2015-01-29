package Inheritance;

class Rectangle{
	int h,b;
	Rectangle(int h, int b)
	{
		this.h=h;
		this.b=b;
	}
	
	void rect()
	{
		System.out.println("Area of Rectangle="+(h*b));
	}
}

class Triangle extends Rectangle{
	int h,b;
	Triangle(int h,int b)
	{
		super(h,b);
		this.h=h;
		this.b=b;
	}
	
	void tri()
	{
		System.out.println("Area of Triangle="+(0.5*h*b));
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Triangle obj=new Triangle(5, 9);
		obj.rect();
		obj.tri();
		// TODO Auto-generated method stub
	}

}
