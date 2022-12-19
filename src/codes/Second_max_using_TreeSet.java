package codes;
import java.util.*;

import java.util.TreeSet;

public class Second_max_using_TreeSet {
	public static void main(String[] args)
	{
		int arr[]= {10,20,20,30,40 ,80,80};
		
		TreeSet<Integer>set=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		// Arrays.stream(a).forEach(sortedSet::add);
		 //   set.remove(((TreeSet<Integer>) set).last());
		   // System.out.println(set.last());
		
		
		
		for(Integer i:set)
		{
			System.out.println(i);
		}
		
		System.out.println("2nd max");
		set.remove(set.last());
		System.out.println(set.last());
		
		
		
	}

}
