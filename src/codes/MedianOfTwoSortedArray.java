package codes;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int arr[]= {2, 3, 5, 8};
		int brr[] = {10, 12, 14, 16, 18, 20};
		int median;
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
			
		}
		//System.out.println(list.get(1));
		//System.out.println(list.get(list.size()-1));
		for(int i=0;i<brr.length;i++)
		{
			list.add(brr[i]);
		}
		
		int l=list.size();
		
		if(l%2==0)
		{
			median=(list.get((list.size()/2))+list.get((list.size()/2)-1))/2;
			
			
		}
		else
		{
			median=list.get(list.size()/2);
		}
		System.out.println(median);
	}

}
