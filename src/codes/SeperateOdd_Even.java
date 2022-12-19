package codes;
import java.util.*;

public class SeperateOdd_Even {

	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		List<Integer>l1=new ArrayList<>();
		List<Integer>l2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				l1.add(arr[i]);
			}
			else
			{
				l2.add(arr[i]);
			}
		}
		l1.addAll(l2);
		System.out.println(l1);
		
	}
}
