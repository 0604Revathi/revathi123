import java.util.Scanner;
public class age {
	public static void main(String[] args) 
		// TODO Auto-generated method stub
{
	System.out.println("enter the age of cond");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	System.out.println("age");
	if(age<=21&&age>=51)
	{
		System.out.println("condition is not valid");
	}
else if(age>21&&age<51)
	{
		System.out.println("condition is valid");
		
	}

	
}
	
		
	}
