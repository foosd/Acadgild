
public class Challenge1 {

	public static void main(String[] args) {
		int month=3;
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.print("Total days are 31");break;
		case 2:System.out.print("Total days are 28");break;
		default : System.out.print("Total days are 30");
		}
	}

}
