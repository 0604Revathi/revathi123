import java.util.*;
public class lengthconv {
	public static double metersToFeet()
	{
		double result = 0;
		int meters=25;
		result=meters/0.3048;
		return result;
	}
	public static double feetsTOInches()
	{
		double result = 0;
		double feet = metersToFeet();
		result = feet*12;
		return result;
	}
	public static double inchesToMeters()
	{
		double result=0;
		double inches=feetsTOInches();
		result=inches*0.0245;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The meters to feets conversion result is"+metersToFeet());
		System.out.println("The meters to feets conversion result is"+feetsTOInches());
		System.out.println("The meters to feets conversion result is"+inchesToMeters());

	}

}
