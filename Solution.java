import java.util.Scanner;
public class Solution
{
	
	int disp (int arr[],int n)
	{
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
	      sum=sum+arr[i];
	     
	    }
		return sum;

	}
	public static void main(String[] args) {
	Solution obj=new Solution();
	Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int n=Sc.nextInt();
    int arr[]=new int[n];
    
    System.out.println("Sum is" +obj.disp(arr,n));
 	}
}


