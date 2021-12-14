package CoreImpPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a no.");
		int no=s.nextInt();
		
		if(no%2 == 0)
		{
			System.out.println("No is Even");
		}
		else
		{
			System.out.println("No is Odd");
		}
		

	}

}
