import java.util.Scanner;

public class qualify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Qualification");
Scanner obj = new Scanner(System.in);
String qualification = obj.nextLine();
qualification=qualification.toLowerCase();
switch(qualification)
{
case "b.tech" : System.out.println("Allowed for job");
break;
case "mba" : System.out.println("Allowed for job");
break;
case "inter" : System.out.println("Not alloed for job");
break;
case "mca" : System.out.println("Not allowed for job");
break;
}
	}

}
