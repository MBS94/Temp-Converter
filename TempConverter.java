import java.util.Scanner;

public class TempConverter{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.print("Fahrenheit or Celsius? ");
		String TempType = input.next();
		System.out.print("Enter a temperature: ");
		int Temp = in.nextInt();
		//System.out.println(Temp);
		if (TempType.equals("Fahrenheit")){
			System.out.print(Temp);
			System.out.print(" degrees in Fahrenheit is ");
			double NewTemp = (5.0/9.0)*(Temp-32);
			System.out.print(NewTemp);
			System.out.print(" degrees in Celsius.");
		}
		else{
			System.out.print(Temp);
			System.out.print(" Degrees in Celsius is ");
			double NewTemp = (1.8*Temp)+32;
			System.out.print(NewTemp);
			System.out.print(" degrees in Fahrenheit.");
		}
			
		
	}
}