package abstract_Class;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Max {

	public static void main(String[] args) {
//		int arr[]= {1,4,5,8,7};
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//		if(arr[i]>max)
//		max=arr[i];
//		}
//
//		int max2=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//		if(arr[i]!=max)
//		{
//		if(arr[i]>max2)
//		max2=arr[i];
//		}
//		}
//		System.out.print(max2);
//

		List<String>list=new ArrayList<>();
		list.add("abhi");
		list.add("aaaaa");
		list.add("bbb");
		
		list.stream().filter((e)->e.contains("abhi")).forEach(System.out::println);
		
		
		
	}

}
