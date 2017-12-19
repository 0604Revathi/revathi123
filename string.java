import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String a[] = new String[4];
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the First Name,Last Name,Designation,Date of Birth");
		for(i=0;i<a.length;i++)
		{
			a[i] = Scanner.nextLine();
		}

		System.out.println("First Name:"+a[0].toUpperCase());
		System.out.println("Last Name :"+a[1].toUpperCase());
		System.out.println("Designation :"+a[2].toUpperCase());
		System.out.println("Date of Birth :"+a[3]);
		
	}
	

}
