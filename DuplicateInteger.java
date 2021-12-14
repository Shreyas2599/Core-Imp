package CoreImpPrograms;

public class DuplicateInteger {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,5,6,8,2,1,7,3,0,4,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
	
			}
		}
		
	}

}
