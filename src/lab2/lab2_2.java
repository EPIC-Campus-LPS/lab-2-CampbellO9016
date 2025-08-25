package lab2;
import java.util.Scanner;
public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Guess the Square Root Game!\n");
		int count = 0;
		for (int i = 0; i < 3; i ++) {
			int rand = (int)(Math.random()*98 + 2);
			double ans = Math.sqrt(rand);
			System.out.print("What's the square root of " + rand + "? ");
			double guess = scan.nextDouble();
			
			if (guess == ans) {
				System.out.println("Nice job!");
				count ++;
			}
			else
				System.out.println("So close, it's " + ans);
		}
		System.out.println("You got " + count + "/3.");
	}

}
