package codes;
import java.util.*;

public class Two2_Sum_problem_SubArray {
	
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int nums[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			nums[i]=kb.nextInt();
		}
		
		int target=kb.nextInt();
		
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			map.put(nums[i], i);
		}
		
		for(int i=0;i<nums.length;i++)
		{
			int num=nums[i];
			int rem=target-num;
			if(map.containsKey(rem))
			{
				int index=map.get(rem);
				if(index==i)continue;
				System.out.print(i+","+index+" ");
				//System.out.print(nums[i]+", "+nums[index]+" ");
				map.remove(num);
			}
			
		}

}
}