import java.util.Scanner;

public class myguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int a = 12;
boolean x = true;
while(x)
{
	int num = sc.nextInt();
	if(num<a)
	{
		System.out.println("is not matched/n Enter big number");
	}
	else if(num>a)
	{
		System.out.println("is not matched/n Enter small number");		
	}
	else if(num == a)
	{
		System.out.println("is matched");
	}
	else
	{
		System.out.println("your guess is wrong try again");
	}

}



	}

}
