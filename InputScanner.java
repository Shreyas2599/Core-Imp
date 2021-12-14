package CoreImpPrograms;

import java.util.*;

public class InputScanner {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String Name=s.next();
		
		System.out.println("Enter Gender:");
		char Gender=s.next().charAt(0);
		
		System.out.println("Enter Age:");
		int age=s.nextInt();
		
		System.out.println("Enter Mobile Number:");
		long mobileno=s.nextLong();
		
		System.out.println("Name :"+Name);
		System.out.println("Gender :"+Gender);
		System.out.println("Age :"+age);
		System.out.println("Mobile Number :"+mobileno);
		
		
	}

}
