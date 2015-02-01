package _Interface;

import java.util.Scanner;

public class Rectangle implements Shape {
	int a,b;
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.draw();
		obj.getArea();
		// TODO Auto-generated method stub
	}

	@Override
	public void draw() {
		System.out.println("Enter height and width:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		in.close();
		// TODO Auto-generated method stub
	}

	@Override
	public void getArea() {
		System.out.println("Area of Rectangle="+a*b);
		// TODO Auto-generated method stub
	}

}
