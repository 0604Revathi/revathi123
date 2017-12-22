import java.util.*;
public class randomnum {

	public static void main(String[] args) {
	System.out.println("Enter the matching number");
	int random;
	int minimum=1;
	int maximum=100;
	random=minimum+(int)(Math.random()*maximum);
	while(true)
	{
		Scanner sc =new Scanner(System.in);
		int matchingnum = sc.nextInt();
		sc.close();
		if(matchingnum>random)
		{
			System.out.println("Enter lesser number");
		}
		if(matchingnum<random)
		{
			System.out.println("Enter higher number");
		}
		if(matchingnum==random)
		{
			System.out.println("Number matched");
			break;
		}
	}

	}

}
