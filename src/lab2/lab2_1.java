package lab2;
import java.util.Scanner;
public class lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		String word = scan.nextLine();
		int leng = word.length();
		word = word.toLowerCase();		
		int indv = word.indexOf("a");
		int inde = word.indexOf("e");
		int indi = word.indexOf("i");
		int indo = word.indexOf("o");
		int indu = word.indexOf("u");
		int[] vowels = {indv, inde, indi, indo, indu};
		int smallest = indv;
		for (int i = 0; i < vowels.length; i ++){
			if (vowels[i] < smallest && vowels[i] > 0)
				smallest = vowels[i];
		}
		scan.close();
		String firstl = word.substring(0, 5);
		String lastl = word.substring(word.length() - 3, word.length());
		lastl = lastl.toUpperCase();
		System.out.println("Number of letters: " + leng);
		System.out.println("Index of the first vowel:" + smallest);
		System.out.println("Uppercase: " + word.toUpperCase());
		System.out.println("Secret string: " + firstl + lastl + leng);
		
	}

}
