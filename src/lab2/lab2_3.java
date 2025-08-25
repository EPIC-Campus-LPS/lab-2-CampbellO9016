package lab2;
import java.util.Scanner;
public class lab2_3 {
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else 
			return num2;
	}
	public static double max(double num1, int num2) {
		if (num1 > num2)
			return num1;
		else 
			return num2;
	}
	public static double max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else 
			return num2;
	}
	public static double max(int num1, double num2) {
		if (num1 > num2)
			return num1;
		else 
			return num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double duble = scan.nextDouble();
		double duble2 = scan.nextDouble();
		double result = max(duble, duble2);
		System.out.println(result + "is larger.");
		

	}

}
