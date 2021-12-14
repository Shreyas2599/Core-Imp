package CoreImpPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String name=sc.next();
		
		
		//String name="shreyas";
		int length=name.length();
		//System.out.println(length);

		String rev="";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
