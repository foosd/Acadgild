package Override;
class Bank{
	 void getRateOfInterest()
	{
		
	}
}

class SBI extends Bank{
	void getRateOfInterest()
	{
		System.out.println("Rate of interest=8%");
	}
}

class ICICI extends Bank{
	void getRateOfInterest()
	{
		System.out.println("Rate of interest=7%");
	}
}

class AXIS extends Bank{
	void getRateOfInterest()
	{
		System.out.println("Rate of interest=9%");
	}
}

public class Overriding {

	public static void main(String[] args) {
		SBI obj1=new SBI();
		ICICI obj2=new ICICI();
		AXIS obj3=new AXIS();
		obj1.getRateOfInterest();
		obj2.getRateOfInterest();
		obj3.getRateOfInterest();
		// TODO Auto-generated method stub
	}

}
