package CoreImpPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) throws IOException
	{
		/*int a=10,b=56,c;
		c=a+b;
		System.out.println("Addition is:"+c);
		*/
		
		
		  int c; Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter first no."); int a=sc.nextInt();
		  
		  System.out.println("Enter second"); int b=sc.nextInt();
		 
		  c=a+b; 
		  System.out.println("Addition is :"+c);
		 
		
		
		/*
		 * int c; BufferedReader reader=new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * System.out.println("Enter first no."); int a=reader.read();
		 * 
		 * System.out.println("Enter second no."); int b=reader.read();
		 * 
		 * c=a+b; System.out.println("Addition is:"+c);
		 */
		
		
		
		
	}
}
