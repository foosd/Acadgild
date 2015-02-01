package _Interface;

import java.util.Scanner;

public class Circle implements Shape {
	int r;
	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.draw();
		obj.getArea();
		// TODO Auto-generated method stub
	}

	@Override
	public void draw() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Radius:");
		r=in.nextInt();
		in.close();
		// TODO Auto-generated method stub
	}

	@Override
	public void getArea() {
		System.out.println("Area of circle="+pi*r*r);
		// TODO Auto-generated method stub
	}

}
