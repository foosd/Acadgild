package Overloading;

public class Rectangle {
	int h,w;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	Rectangle(int a){
		h=a;
		w=a;
		System.out.println("Area of Square="+(h*w));
	}
	Rectangle(int a,int b){
		h=a;
		w=b;
		System.out.println("Area of Rectangle="+(h*w));
	}

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(5);
		Rectangle obj2=new Rectangle(5, 8);
		// TODO Auto-generated method stub
	}

}
