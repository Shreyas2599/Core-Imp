package CoreImpPrograms;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Which factorail do you want?");
		int no = s.nextInt();

		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorail is :" + fact);

	}

}
