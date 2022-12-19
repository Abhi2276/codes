package codes;
import java.util.*;
import java.util.HashMap;

public class Practise_1stNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaabbcdeffff";
		char arr[]=s.toCharArray();
		
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		
		
		
		for(int i=0;i<map.size();i++)
		{
			int feq=map.get(arr[i]);
			if(feq==1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
