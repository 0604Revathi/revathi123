import java.util.Scanner;


public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int guess = sc.nextInt();
int a = 12;
if(a==guess)
{
	System.out.println("is matched");
}
else
{
	System.out.println("is not match.\nEnter another number");
}

	}

}
