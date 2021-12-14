package CoreImpPrograms;

import java.util.Scanner;

public class FactorailRecursion {

	static int fact = 1;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Which factorail do you want?");
		int no = s.nextInt();

		FactorailRecursion fs = new FactorailRecursion();
		fs.calFact(no);
		System.out.println(fact);

	}
	void calFact(int no) {
		if (no >= 1) {
			fact = fact * no;
			calFact(no - 1);
		}
	}
}
