package CoreImpPrograms;

public class GreaterNumber3 {

	public static void main(String args[])
	{
		int a=20,b=70,c=50;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
