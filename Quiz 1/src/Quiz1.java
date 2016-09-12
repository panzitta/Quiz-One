import java.util.Scanner;

public class Quiz1 {

	public static void main(String[]args) {
		Scanner input= new Scanner (System.in);
		//Input Variables
		System.out.println("Please enter the quarterback's touchdown count:");
		double TD = input.nextDouble();
		System.out.println("Please enter the quarterback's total yards count:");
		double YDS = input.nextDouble();
		System.out.println("Please enter the quarterback's interception count:");
		double INT=input.nextDouble();
		System.out.println("Please enter the quarterback's number of completions:");
		double comp=input.nextDouble();
		System.out.println("Please enter the quarterback's number of passes attempted:");
		double ATT = input.nextDouble();
		//Passer Rating Formula
		double a=((comp/ATT)-.3)*5;
		double b=((YDS/ATT)-3)*.25;
		double c=(TD/ATT)*20;
		double d=2.375-(INT/ATT*25);
		
		double PasserRating=((a+b+c+d)/6)*100;
		System.out.println(PasserRating);
		input.close();
		
	}
}
