package codes;

import java.util.HashMap;
import java.util.*;

public class Dublicate_words_from_String {

	public static void main(String[] args) {
		
		String s="I love india love india";
		String arr[]=s.split("");
		Map<String,Integer>map=new HashMap<String,Integer>();
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
			if(feq>1)
			{
				System.out.print((arr[i]));
			}
			else
			{
				continue;
			}
		}

	}

}
